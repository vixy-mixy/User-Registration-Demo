import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Form from './components/Form';
import UserDetails from './components/UserDetails';
import Home from './components/Home';

function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Home />}></Route>
        <Route path='/form' element={<Form />}></Route>
        <Route path="/userDetails" element={<UserDetails />}></Route>
      </Routes>
    </Router>
  );
}

export default App;
