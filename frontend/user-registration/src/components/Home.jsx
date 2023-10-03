import React from 'react'
import { Link } from 'react-router-dom'

const Home = () => {
  return (
    <div>
        <Link to={"/form"}>Register</Link>
    </div>
  )
}

export default Home