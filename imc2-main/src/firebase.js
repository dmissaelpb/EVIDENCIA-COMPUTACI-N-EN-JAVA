import firebase from "firebase";

const firebaseConfig = {
  apiKey: "AIzaSyBE-Ma5VYrr5RydAWqyP73m4d_ds08nhzE",
  authDomain: "data-be477.firebaseapp.com",
  projectId: "data-be477",
  storageBucket: "data-be477.appspot.com",
  messagingSenderId: "306696913008",
  appId: "1:306696913008:web:154c0e14e749f3c34ef4b5"
};

const firebaseApp = firebase.initializeApp(firebaseConfig);
const db = firebaseApp.firestore();
const auth = firebase.auth();
const provider = new firebase.auth.GoogleAuthProvider();
const storage = firebase.storage();

export { auth, provider, storage };
export default db;
