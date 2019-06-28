package com.example.application.tripiser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TourGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guide);
    }

    public void onTaj(View view)
    {
        String str="Taj Mahal is indeed a beautiful place. When you visit, make sure you take a picture of yourself and your spouse with the mausoleum as the background...who knows, the love that the emperor had for his wife to dedicate this kind of resources for her remembrance after death might rub off on you.\nOne of the most significant Mughal Empire architectural marvels still stands in all its beauty and finesse in Agra, Uttar Pradesh, India. The Taj Mahal is a white marble built by Mughal emperor Shah Jahan in memory of his third wife, Mumtaz Mahal. In Arabic, the Taj Mahal is known as \"crown of palaces\". It is said to be the jewel of Islamic art in a nation that is predominantly Hindu. As if to show case the expanse of the Mughal Empire, it combines architectures from all the corners of the Empire including Islamic, Persian, Ottoman Turkish and Indian architectural styles. Below are some facts that you may find interesting about Taj Mahal.\n" +
                "\n" +
                "1. The Taj Mahal was built by a whopping 22,000 laborers, painters, stonecutters, embroidery artists.\n" +
                "\n" +
                "2. Legend has it that Emperor Shah Jahan intended to build another Taj Mahal in black marble across the river but a war with his sons interrupted these plans.\n" +
                "\n" +
                "3. The changing moods of the Emperors wife are well captured by the changing hues of the Mausoleum at different times of the day. It takes a pinkish hue in the morning, milky white in the evening and golden at night when illuminated by moonlight.\n" +
                "\n" +
                "4. It intricate work of art and architectural genius took 17 years to complete.\n" +
                "\n" +
                "5. The most recognizable feature is the white dome at the peak of the mausoleum. Often called the 'onion dome', it rises to about 35 meters (115 feet) and is surrounded by four other domes.\n" +
                "\n" +
                "6. Taj Mahal is a famous Indian landmark and tourist magnet, attracting more than a million tourists every year.\n" +
                "\n" +
                "7. As always, rumor mills are on the overdrive about this mausoleum. It is rumored that the Emperor ordered that all the workers who worked on the mausoleum get their hands chopped of so that no one could make anything like it ever again.\n" +
                "\n" +
                "8. If it was to be built today, Taj Mahal would cost the Emperor about US$100 to make it as beautiful as it is.\n" +
                "\n" +
                "9. The materials that were used to build Taj Mahal were transported to the construction site by a whopping 1,000 elephants.\n" +
                "\n" +
                "10. Many of the precious stones on the mausoleum were ripped off from the walls of the mausoleum by the British army during the Indian rebellion of 1857.\n" +
                "\n" +
                "Taj Mahal is indeed a beautiful place. When you visit, make sure you take a picture of yourself and your spouse with the mausoleum as the background...who knows, the love that the emperor had for his wife to dedicate this kind of resources for her remembrance after death might rub off on you.";
        Intent i=new Intent(this,DetailActivity.class);
        i.putExtra("strdetail",str);
        startActivity(i);
    }

    public void onChrist(View view)
    {
        String str="1. Outcome of a 9-year long construction\n" +
                "\n" +
                "Although it seems like a less endeavoring task, in reality, it wasn’t. It took around 9 years from 1922-1931 to make this grand statue mainly due to its cliff-like location.\n" +
                "Source: Wikipedia\n" +
                "\n" +
                "2. Tts 1st proposal was canceled!\n" +
                "\n" +
                "A local priest, Pedro Maria Boss in the 1850’s, presented this thought in front of the finance department. Finding it less feasible, its idea was rejected.\n" +
                "Source: brazilcultureandtravel.com\n" +
                "\n" +
                "3. When its approval was accepted!\n" +
                "\n" +
                "The thought of creating it was halted in 1850’s, but as good thoughts can never die, the proposal of creating it got erupted by Catholic Circle of Rio. By carrying the countless financial and moral support of the local people, the proposal was accepted.\n" +
                "Source: brazilcultureandtravel.com\n" +
                "\n" +
                "4. 3rd tallest statue of the almighty Jesus!\n" +
                "\n" +
                "It is the 3rd tallest statue of Jesus in the world after Poland’s Christ the King and Bolivia’s Cristo de la Concordia.\n" +
                "Source: thejesusquestion.org\n" +
                "\n" +
                "5. What does it symbolize?\n" +
                "\n" +
                "The statue was made with the purpose to show that Christ loves all, spread peace and to display the devotion of the city towards the almighty.\n" +
                "Source: brazilcultureandtravel.com\n" +
                "\n" +
                "6. Made with a special kind of stone!\n" +
                "\n" +
                "To make a highly resistible statue, a special kind of rock was used. The stone was specially imported from Sweden and hence with the blend of concrete and soapstone this wonder was made.\n" +
                "Source: brazilcultureandtravel.com\n" +
                "\n" +
                "7. Who sketched it?\n" +
                "\nIt was sketched by a French sculptor and son of a famous French sculptor Marcel Landowski named Paul Landowski.\n" +
                "Source: Wikipedia, image: paul-landowski.com\n" +
                "\n" +
                "9. Total expenditure\n" +
                "\n" +
                "It was a pretty expensive venture and thus was made in approx. $250,000 which is equal to $3.2 million of today.\n" +
                "Source: softschools.com\n" +
                "\n" +
                "10. How much does it weigh?\n" +
                "\n" +
                "As it was built using solid stones, it weighs around 635 tons.\n" +
                "Source: brazilcultureandtravel.com\n" +
                "\n" +
                "11. Inclusion in wonders list!\n" +
                "\n" +
                "After a long wait, in July 2007 the Christ Redeemer was inducted as one of the 7 wonders of the world.\n" +
                "Source: softschools.com\n" +
                "\n" +
                "13. Lightning once damaged it!Back in 2008, a ferocious thunder strike damaged the head, eyebrows, and fingers. Thanks to the soapstone insulating feature, the majority of the lightning was earthed. The same stone from the same place was used in the reconstruction.\n" +
                "On January 16, 2014, the lightening again damaged the finger of the statue.\n" +
                "Source: brazilcultureandtravel.com, Image: EPA\n" +
                "\n" +
                "14. A sttempt to ruin it!\n" +
                "\n" +
                "An impish dauber in early 2010 sprayed paint on the head and right arm of the statue. The local mayor proclaimed it as a “crime against the nation,” and the offender was later identified.\n" +
                "Source: softschools.com\n" +
                "\n" +
                "15. Many modes to reach there!\n" +
                "\n" +
                "Being the most attracting tourist spot, earlier people used to reach Christ the Redeemer by road or by walk, but in 2003 escalators and elevators were introduced to make it convenient for visitors.\n" +
                "Source: softschools.com\n" +
                "\n" +
                "16. Best time to observe it\n" +
                "\n" +
                "Often advised by the local people that the best time to see this wonder is either in the evening or at night as it presents a sparkling view of the city.";
        Intent i=new Intent(this,DetailActivity.class);
        i.putExtra("strdetail",str);
        startActivity(i);
    }

    public void onGiza(View view)
    {
        String str="1. THE EARLIEST PYRAMIDS IN EGYPT WERE BUILT A CENTURY PRIOR.\n" +
                "Tombs for the kings of Egypt had been constructed underground for many years before the pharaoh Djoser built a step pyramid in Saqqara, south of Giza, around 2630 BCE. Djoser’s tomb predates that of Sneferu, whose Red Pyramid was the first completed true pyramid, built sometime between 2613 and 2589 BCE.2. THE GREAT PYRAMID WAS CONSTRUCTED BETWEEN 2560 and 2540 BCE.\n" +
                "Not long after Sneferu’s 341-foot tall Red Pyramid was completed in Dahshur (his first pyramid in Maidum was abandoned, and his second was turned into the Bent Pyramid), Khufu began work on the Great Pyramid at Giza. The largest of all the tombs built in the ancient world, the Great Pyramid is the centerpiece of a complex that includes tombs for Khufu’s wives, a mortuary temple, valley temple, boat pits, and a causeway.\n" +
                "\n" +
                "3. THE GREAT PYRAMID WAS BUILT FOR THE PHARAOH KHUFU.\n" +
                "The second pharaoh of the 4th Dynasty, Khufu, Hellenized as Cheops, was the son of Sneferu and Hetepheres I and likely ascended to the throne in his 20s. Very little information about Khufu has been preserved, and the conflicting accounts of his reign were written centuries after his death, most notably in Herodotus’ Histories. The only acknowledged statue of him stands a mere three inches.\n" +
                "\n" +
                "4. IT WAS THE TALLEST MAN-MADE STRUCTURE IN THE WORLD FOR THOUSANDS OF YEARS...\n" +
                "At 481 feet tall, the Great Pyramid eclipsed every structure ever built until the completion of the Lincoln Cathedral in 1311 CE. The Cathedral topped out around 525 feet before the collapse of its central spire in 1548.\n" +
                "\n" +
                "5. ...BUT IT HAS SHRUNK BY ABOUT 25 FEET.\n" +
                "Today, the Great Pyramid stands only about 455 feet tall, as four millennia of erosion has sliced 25 feet of stone from the structure. An iron triangle currently sits atop the pyramid and represents the pyramidion, or capstone, that once marked the apex of the structure.\n" +
                "\n" +
                "6. ABOUT 2.3 MILLION STONE BLOCKS WERE USED TO BUILD THE PYRAMID.\n" +
                "The quarry at Aswan, about 525 miles upriver, was the site for the stone used to make the massive blocks that comprise the pyramid. Each block weighs about 2.5 tons on average, and the pyramid itself is estimated to weigh 6.5 million tons.\n" +
                "\n" +
                "7. A SERIES OF RAMPS WAS LIKELY BUILT TO CONSTRUCT THE PYRAMID.\n" +
                "With no hard evidence, historians and scholars have theorized that a system of ramps had to have been the method for raising and maneuvering the massive granite blocks for the Great Pyramid. Archaeological evidence at other pyramid sites indicates that linear, staircase, and spiral ramps were used to slowly bring stones hundreds of feet into the air. Once there, historians believe wooden and bronze levers were used to intricately position the stones.\n" +
                "\n" +
                "8. THE INTERIOR CONTAINS THREE CHAMBERS.\n" +
                "Designed as a tomb, the Great Pyramid contains three burial chambers that were intended to house Khufu and the litany of goods and treasures he would take with him in the afterlife. Upon entering the pyramid, a passage (3.1 feet high, 3.4 feet wide) descends about 354 feet into the bedrock, levels off, and continues another 29 feet to an unfinished, underground chamber. About 93 feet down the descending passage, a hole in the roof leads to the ascending passage, a 129-foot stretch that rises to the Grand Gallery (it is the only known pyramid with a passage that slopes upward). At the start of the Gallery is a passage to the Queen’s Chamber, which measures 18.9 feet by 17.2 feet and is 20 feet high. A series of shafts, extending from the north and south walls, were explored multiple times but their purpose has yet to be uncovered.\n" +
                "\n" +
                "Back at the Grand Gallery, a 28-foot high, 153-foot long passage leads up to the King’s Chamber. Inside, the walls are entirely covered in granite, and a pair of shafts, which at one point were thought to be air shafts, slope up and out the north and south sides of the pyramid, leading many experts to believe that they had an astrological purpose. Khufu’s sarcophagus is the only object that remains in the room, and its lid is gone and a chunk of the corner is missing. Atop the roof was a series of relief chambers that took pressure off the room below.\n" +
                "\n" +
                "9. ALMOST EVERYTHING IN THE CHAMBERS HAS BEEN TAKEN.\n" +
                "Some accounts state human remains were present in the King’s Chamber around the 9th century CE, but constant looting has left the interior barren except for Khufu’s red-granite sarcophagus. In addition, the white limestone casing that once covered the exterior was also taken and used by various rulers and kings in other building projects.\n" +
                "\n" +
                "10. HISTORIANS BELIEVE SKILLED LABORERS BUILT THE PYRAMID.\n" +
                "Long thought to have been the work of thousands of slaves, experts today believe 20,000-30,000 skilled laborers, including stone masons, engineers, architects, surveyors, builders, and other craftsmen, were conscripted to construct Khufu’s temple. Egyptologists Mark Lehner and Zahi Hawaas theorize that a small crew worked year-round on the project, while a larger collection of workers was summoned during the summer months when the Nile flooded the surrounding valley and integrated with the permanent labor force.\n" +
                "\n" +
                "11. KHUFU'S SON AND GRANDSON BUILT PYRAMIDS ON THE SAME SITE.\n" +
                "Along with his tomb, Khufu’s pyramid complex includes three small pyramids built for his wives, a mortuary temple, and mastabas (tombs) for the relatives and officials who would accompany Khufu on his journey in the afterlife. His son, Khafre, built a 446-foot pyramid, which appears taller than Khufu’s from certain angles because of its position on slightly elevated ground. Khafre also commissioned the the Great Sphinx at the front of the complex. Menkaure, the son of Khafre and grandson of Khufu, built a relatively modest 213-foot pyramid nearby.\n" +
                "\n" +
                "12. IT IS BOTH THE OLDEST AND THE ONLY REMAINING ANCIENT WONDER.\n" +
                "Named one of the Seven Wonders of the Ancient World, the Great Pyramid is the only work that has survived into modernity. Archaeological evidence has been discovered that indicates, like the Great Pyramid, some of the legendary structures (the Lighthouse of Alexandria, the Mausoleum at Halicarnassus, the Temple of Artemis at Ephesus) were real, while the others (the Hanging Gardens of Babylon, the Statue of Zeus at Olympia, the Colossus of Rhodes) are harder to verify, and may be composites of legend, myth, and fact.";
        Intent i=new Intent(this,DetailActivity.class);
        i.putExtra("strdetail",str);
        startActivity(i);
    }

    public void onWall(View view)
    {
        String str=
                "1. Contrary to common belief, the Great Wall of China cannot be seen from space with the naked eye. It can be seen with aid.\n" +
                "\n" +
                "2. As early as the Qin Dynasty (221-207BC) when building the Great Wall, glutinous rice flour was used in making the binding material to bind the bricks.\n" +
                "\n" +
                "3 .The sections of the Great Wall that we mostly associate with The Great Wall of China were built by the Ming Dynasty. This was the last part of the wall that was built and has been made with brick and features many tall watch-towers.\n" +
                "\n" +
                "4. The Great Wall of China has been called the longest cemetery on Earth. Over a million people died building the Wall and archaeologists have found human remains buried under parts of the wall.\n" +
                "\n" +
                "5. Although the official number of the length of the Great Wall is 8851.8 kilometers (5500 miles), the length of all the Great Wall built over thousands of years is estimated at 21,196.18 kilometers (13,170 miles). The circumference of the Equator is 40,075 kilometers (24,901 miles).\n" +
                "\n" +
                "6 . The Great Wall of China is threatened with erosion. The northwestern sections (e.g. in Gansu and Ningxia provinces) of the Great Wall are deteriorating so quickly. It is believed that these sections may disappear within 20 years, due to demolishment by nature and human. \n" +
                "\n" +
                "7. Over 10 million people visit the Great Wall of China every year. The most famous section of the Great Wall-Badaling, had been visited by over 300 heads of state and VIPs from around the world, the first of which was Soviet. But it is also the busiest section of wall which is restored. If you are a hiker who like to see the real unspoiled Great Wall which is off the beaten path, we don’t suggest you go there. \n" +
                "\n" +
                "8. During the Cultural Revolution (1966-1976), many bricks of the Great Wall were taken away to use in building homes, farms or reservoirs. Otherwise many sections of the Great Wall would be preserved much better than what they are like today.\n" +
                "\n" +
                "9. The Great Wall is wide enough in some places to drive a car over it.\n" +
                "\n" +
                "10 . The most well known of all of the legends of The Great Wall of China is the story of \"Men Jiangnu’s Bitter Weeping\" whose husband died building the wall. Her weeping was so bitter that a section of the wall collapsed, revealing her husband’s bones so she could bury them.";
        Intent i=new Intent(this,DetailActivity.class);
        i.putExtra("strdetail",str);
        startActivity(i);
    }

    public void onMachu(View view)
    {
        String str = "10. In the Quechua Indian language, “Machu Picchu” means “Old Peak” or “Old Mountain.”\n" +
                "\n" +
                "9. Machu Picchu is made up of more than 150 buildings ranging from baths and houses to temples and sanctuaries.\n" +
                "\n" +
                "8. The compound contains more than 100 separate flights of stairs. Most of the individual staircases were carved from one slab of stone.\n" +
                "\n" +
                "7. Although many of the stones that were used to build the city were more than 50 pounds, it is believed that no wheels were used to transport these rocks up the mountain. Rather, it is thought that hundreds of men pushed the heavy rocks up the steep mountain side.\n" +
                "\n" +
                "6. Many different theories exist about Machu Picchu’s purpose—a royal estate and a secret ceremonial center among them.\n" +
                "\n" +
                "5. The Incas were some of the best masons in the world. The structures were so well built with a technique called ashlar (stones that are cut to fit together without mortar) that not even a knife blade can fit in between stones.\n" +
                "\n" +
                "4. Machu Picchu was only known locally until Yale Professor Hiram Bingham re-discovered the site in 1911. His book, The Lost City of the Incas, was based on his findings.\n" +
                "\n" +
                "3. A long-standing dispute between Peru and Yale University has existed over the artifacts collected by Bingham during his exploration of the site. Yale maintains that they own the items while Peru insists they were given on loan.\n" +
                "\n" +
                "2. Machu Picchu was an astronomical observatory, and its sacred Intihuatana stone accurately indicates the two equinoxes. Twice a year, the sun sits directly over the stone creating no shadow.\n" +
                "\n" +
                "1. Unfortunately, most cities built by the Inca civilization were destroyed by the Spanish conquest. Machu Picchu was in a hidden location—invisible from below—and not found, making it one of the most well-preserved Inca cities and an archeological gem.";

        Intent i = new Intent(this, DetailActivity.class);
        i.putExtra("strdetail", str);
        startActivity(i);
    }

    public void onCollos(View view) {
        String str = "1.) The Colosseum was not designed by a single prominent designer/architect as it would be if built today. During medieval times it was said to have been designed by the ancient Roman poet Virgil. Now we know that Virgil died well before the Colosseum was conceived.\n" +
                "\n" +
                "2.) The Colosseum was built by Emperor Vespasian, founder of the Flavian dynasty, for Titus, his successor.\n" +
                "\n" +
                "3.) Colosseum is an elliptical building measuring 189 meters long and 156 meters wide with a base area of 24,000 m² with a height of more than 48 meter.\n" +
                "\n" +
                "4.)  The Colosseum has over 80 entrances and can accommodate about 50,000 spectators.\n" +
                "\n" +
                "5.)  It is thought that over 500,000 people lost their lives and over a million wild animals were killed throughout the duration of the Colosseum hosted people vs. beast games.\n" +
                "\n" +
                "6.) There were 36 trap doors in Arena allowing for elaborate special effects\n" +
                "\n" +
                "7.) All Ancient Romans had free entry to the Colosseum for events, and were also fed throughout the spectacles.\n" +
                "\n" +
                "8.)  Festivals as well as games could last up to 100 days in the Colosseum.9.)  The Ancient Romans would sometimes flood the Colosseum and have miniature ship naval battles inside as a way of entertainment.\n" +
                "\n" +
                "10.) The Colosseum only took 10 years to build starting in 70 AD and was completed in 80 AD using over 60,000 Jewish slaves.\n" +
                "\n" +
                "11.) The marble façade and some parts of the Colosseum were used for the construction of St Peter’s Basilica and later monuments.\n" +
                "\n" +
                "12.)  Many natural disasters devastated the structure of the Colosseum, but it was the earthquakes of 847 AD and 1231 AD that caused most of the damage you see today.\n" +
                "\n" +
                "13.)  The original name of the Colosseum was Flavian Amphitheater, after the Flavian Dynasty of Emperors.\n" +
                "\n" +
                "14.)  Rome´s most popular monument was built for three reasons. As a gift to the Roman Citizens from the Flavian Dynasty to increase their popularity, to stage various forms of entertainment, and to showcase Roman engineering techniques to the world.\n" +
                "\n" +
                "15.) The Colosseum was used for gladiatorial contests and public spectacles such as animal hunts, mock sea battles, re-enactments of famous battles, executions and dramas.\n" +
                "\n" +
                "16.) During the inaugural games of the Colosseum in 80 CE held by Titus, some 9,000 wild animals were slaughtered.\n" +
                "\n" +
                "17.) In 107 CE, Emperor Trajan is said to have celebrated his victories in Dacia with contests involving 11,000 animals and 10,000 gladiators within 123 days.\n" +
                "\n" +
                "18.) It is estimated that the games played in the Colosseum for hundreds of years have taken the lives of about 500,000 people and over a million wild animals.\n" +
                "\n" +
                "19.) The last gladiatorial fights occurred in 435 CE and the last animal hunts stopped in 523 CE. It was primarily due to the cost of procuring animals and gladiators and maintaining the expensive facility.\n" +
                "\n" +
                "20.) More than 100,000 cubic meters of travertine stone were used for the outer wall of Colosseum which was set without mortar held together by 300 tons of iron clamps.\n" +
                "\n" +
                "21.) Colosseum was built near the giant statue of Colossus which was part of the Nero’s Park. The current name was derived from the statue of Colossus.\n" +
                "\n" +
                "22.) Based on historical evidences, it shows that 200 bullock carts were used to transport marbles to the construction site.\n" +
                "\n" +
                "23.) The total amount of marbles used for the construction of the Colosseum was estimated at 100,000 cubic meters.\n" +
                "\n" +
                "24.) Receiving millions of visitors every year, the Colosseum is the most famous tourist attraction of Rome.\n" +
                "\n" +
                "25.) Despite its brutal pagan origins, the Colosseum has been used as a worship space by Christians over the centuries. A large cross was removed in the 1870's during a frenzy of secular archaeology funded by the new Italian state. That cross was replaced by Mussolini in 1926 in a cynical effort to placate Catholics.26.) Gladiators were marginalized persons in Roman society, without the rights of citizenship, and essentially (or literally) slaves.The gladiators were both admired and reviled by the Romans.\n" +
                "\n" +
                "27.) Although the Romans' gladiatorial spectacles petered out in about 432 AD, it was not because of any Christian edict. It was primarily due to the cost of procuring animals and gladiators and maintaining the expensive facility, which by this time was badly deteriorating.\n" +
                "\n" +
                "28.) The Fighting Killed Off Whole Species The sheer quantity of slaughter in the Colosseum saw the number of lions, jaguars, and tigers plummet across the globe. According to some, Roman hunting absolutely “devastated the wildlife of North Africa and the entire Mediterranean region,” wiping some species of animal off the map entirely.\n" +
                "\n" +
                "29.) After one particularly brutal set of games in which 9,000 animals were slaughtered, the hippo disappeared from the river Nile. Creatures like the North African elephant, which was also commonly used as a war elephant during the time, were wiped of the face of the Earth completely.\n" +
                "\n" +
                "30.) The area beneath the Colosseum was called the Hypogeum (meaning underground). The hypogeum consisted of two-level subterranean network of tunnels and 32 animal pens. It had 80 vertical shafts which provided instant access to the arena for animals and scenery.\n" +
                "\n";
        Intent i = new Intent(this, DetailActivity.class);
        i.putExtra("strdetail", str);
        startActivity(i);
    }
}
