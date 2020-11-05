import {
	ArrowForward,
	ArrowRight,
	HeroBg,
	HeroBtnWrapper,
	HeroContainer,
	HeroContent,
	HeroH1,
	HeroP,
	VideoBg,
} from './HeroElements';
import React, { useState } from 'react';

import { Button } from '../ButtonElement';
import Video from '../../videos/video.mp4';

const HeroSection = () => {
	const [hover, setHover] = useState(false);
	const onHover = () => {
		setHover(!hover);
	};

	return (
		<HeroContainer>
			<HeroBg>
				<VideoBg autoPlay loop muted src={Video} type='video/mp4' />
			</HeroBg>
			<HeroContent>
				<HeroH1>Logistica de entregas sem complicação</HeroH1>
				<HeroP>
					Amplifique seus ganhos com entregas no ifood hoje e faça parte de uma
					das maiores operações logisticas do Brasil.
				</HeroP>
				<HeroBtnWrapper>
					<Button to='registro' onMouseEnter={onHover} 
					onMouseLeave={onHover}
					primary="true"
					dark="true">
						Participe já {hover ? <ArrowForward /> : <ArrowRight />}
					</Button>
				</HeroBtnWrapper>
			</HeroContent>
		</HeroContainer>
	);
};

export default HeroSection;
