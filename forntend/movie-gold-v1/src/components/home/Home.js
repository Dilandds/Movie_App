import React from "react";
import Hero from "../hero/Hero";
const Home = ({ movies }) => {
  console.log("Movies in Hero:", movies);
  return <Hero movies={movies}></Hero>;
};

export default Home;
