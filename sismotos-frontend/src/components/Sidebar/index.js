import {
	CloseIcon,
	Icon,
	SidebarBtnWrap,
	SidebarContainer,
	SidebarLink,
	SidebarMenu,
	SidebarRoute,
	SidebarWrapper
} from './SidebarElements';

import React from 'react';

const Sidebar = ({toggle, isOpen}) => {
	return (
		<SidebarContainer isOpen={isOpen} onClick={toggle}>
			<Icon onClick={toggle}>
				<CloseIcon />
			</Icon>
			<SidebarWrapper>
				<SidebarMenu>
					<SidebarLink to='sobre' onClick={toggle}>Sobre nós</SidebarLink>
					<SidebarLink to='servicos' onClick={toggle}>Serviços</SidebarLink>
					<SidebarLink to='registro' onClick={toggle}>Inscreva-se</SidebarLink>
				</SidebarMenu>
                <SidebarBtnWrap>
				    <SidebarRoute to='/login'>Entrar</SidebarRoute>
                </SidebarBtnWrap>
			</SidebarWrapper>
		</SidebarContainer>
	);
};

export default Sidebar;
