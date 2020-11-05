import React, {useState} from 'react'
import { homeBonus, homeChat, homeObjOne } from '../components/InfoSection/Data';

import HeroSection from '../components/HeroSection';
import InfoSection from '../components/InfoSection';
import Navbar from '../components/Navbar';
import Sidebar from '../components/Sidebar';

const Home = () => {
    const [isOpen, setIsOpen] = useState(false)
    
    const toggle = () => {
        setIsOpen(!isOpen)
    };

    return (
        <>
          <Sidebar isOpen={isOpen} toggle={toggle}/>
          <Navbar toggle={toggle}/>
          <HeroSection />
          <InfoSection {...homeObjOne}/>
          <InfoSection {...homeChat}/>
          <InfoSection {...homeBonus}/>
        </>
    )
};

export default Home
