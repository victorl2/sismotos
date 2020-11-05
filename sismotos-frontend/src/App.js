import './App.css';

import Home from './pages';
import React from 'react';
import { BrowserRouter as Router } from 'react-router-dom';

function App() {
	return (
		<Router>
			<Home />
		</Router>
	);
}

export default App;
