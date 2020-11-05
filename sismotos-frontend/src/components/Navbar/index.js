import {
	MobileIcon,
	Nav,
	NavBtn,
	NavBtnLink,
	NavItem,
	NavLinks,
	NavLogo,
	NavMenu,
	NavbarContainer,
} from './NavbarElements';

import { FaBars } from 'react-icons/fa';
import React from 'react';

const Navbar = ({toggle}) => {
	return (
		<>
			<Nav>
				<NavbarContainer>
					<NavLogo to='/'>sismotos</NavLogo>
					<MobileIcon onClick={toggle}>
						<FaBars />
					</MobileIcon>
					<NavMenu>
						<NavItem>
							<NavLinks to='sobre'>Sobre nós</NavLinks>
						</NavItem>
						<NavItem>
							<NavLinks to='servicos'>Serviços</NavLinks>
						</NavItem>
						<NavItem>
							<NavLinks to='registro'>Inscreva-se</NavLinks>
						</NavItem>
					</NavMenu>
					<NavBtn>
						<NavBtnLink to='/login'>Entrar</NavBtnLink>
					</NavBtn>
				</NavbarContainer>
			</Nav>
		</>
	);
};

export default Navbar;
