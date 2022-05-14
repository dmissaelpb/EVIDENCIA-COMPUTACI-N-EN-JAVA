import React, {useEffect, useState}from 'react'
import styled from 'styled-components'
import db  from '../firebase'
import { useSelector } from "react-redux";
import {
    selectUserName,
  } from "../features/user/userSlice";

const Home = () => {

    const [peso, setPeso] = useState(0.0)
    const [estatura, setEstatura] = useState(0.0)
    const [edad, setEdad] = useState(0)
    const [sexo, setSexo] = useState("")
    const [registros, setRegistros] = useState([])

    const userName = useSelector(selectUserName);

    const getAllData = () => {
        db.collection("registros").get().then((querySnapshot) => {
            querySnapshot.forEach((doc) => {
                console.log(doc.data());
            });
        });
    }

    useEffect(() => {
      getAllData()
    }, [])
    
 

  const calcular = (e, weight, height) => {
      e.preventDefault()
      const imcData = weight / (height * height)

      db.collection("registros").add({
        name: " Carlos",
        peso: peso,
        estatura: estatura,
        edad: edad,
        sexo: sexo,
        imc: imcData.toString()
    })
    .then((docRef) => {
        console.log("Document written with ID: ", docRef.id);
    })
    .catch((error) => {
        console.error("Error adding document: ", error);
    });
  }

    return (
        <Container>
            <Title>Calculadora de Masa Corporal</Title>
            <Label>Peso:</Label>
            <Input onChange={e => setPeso(e.target.value)}/>
            <Label>Estatura:</Label>
            <Input onChange={e => setEstatura(e.target.value)}/>
            <Label>Edad:</Label>
            <Input onChange={e => setEdad(e.target.value)}/>
            <Label>Sexo:</Label>
            <Input onChange={e => setSexo(e.target.value)}/>
            <Button onClick={(e) => calcular(e,peso,estatura)} >Calcular</Button>

            <div>
            {registros &&
          registros.map((product) => (
            <Lista key={product.id}>
                    <Name></Name>
                    <Edad>{product.edad}</Edad>
                        <Peso></Peso>
                        <Estatura></Estatura>
                        <IMC></IMC>
                        <Sexo></Sexo>
                    </Lista>

          ))}
            </div>
          
        </Container>
    )
}


export default Home

const Container = styled.main`
    min-height: calc(100vh - 70px);
    padding: 0 calc(3.5vw + 5px);
    position: relative;
    overflow-x: hidden
    ;
    &::before{
        background: url("/images/home-background.png") center center / cover no-repeat fixed;
        content: "";
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        z-index: -1;
    }
`
const Title = styled.h1`
    margin: 0 auto;
`

const Label = styled.p``

const Input = styled.input``

const Button = styled.button`
    display: block;
    margin: 20px 0;
`
const Lista = styled.div``
const Name = styled.p``
const Edad = styled.p``
const Estatura = styled.p``
const IMC = styled.p``
const Peso = styled.p``
const Sexo = styled.p``
