import axios from "axios";
export default axios.create({
  baseURL: "https://movie-api-z2hi.onrender.com",
  headers: {
    "Access-Control-Allow-Origin": "https://movie-api-z2hi.onrender.com",
  },
});
