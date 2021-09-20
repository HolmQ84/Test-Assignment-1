1. REFLECTIONS

1.1 - SHOOTING

A woman fired a shot at a man with her gun, but the man did not die.
List the possible reasons for the man not dying:

ANSWER:
- She didnt hit him.
- She shot him with a non-lethal gun (Water pistol, Trap pistol, etc.)
- She hit him in a non-lethal area (Leg, Arm, Shoulder, Foot, etc.)
- The man was wearing a bulletproof vest.
- The man was wearing an impenetrable armor.
- The man was immortal.

1.2 - ALIEN

An alien meets you and it asks you to teach it how to brush its teeth.
Assume that the alien has teeth exactly like yours, and is as smart as you,
but it needs a clear step-by-step instruction. List the steps. Be as detailed as you can.
(Example: Hold the toothpaste with your left hand, turn the cap anti-clockwise)

ANSWER:
- Open the toothpaste by turning the cap anti-clockwise.
- Hold the toothbrush in your left/right hand, with the hairs pointing toward you.
- Hold the toothpaste in the opposite hand.
- Put an amount of toothpaste on the toothbrush, the amount of toothpaste should be equal to the nail
  of your little finger.
- Put the toothbrush with the toothpaste in your mouth, while applying some toothpaste from the brush
  on your teeth.
- Remember not to swallow the toothpaste, since it's not good for your stomach.
- Brush your teeth by circling the toothbrush on each tooth, start with your upper jaw.
- Each side of the teeth should be brushed for about 2-3 seconds.
- You should make sure that each tooth is brushed from all three different angles: Front, Back and Top.
- When you have completed brushing every single tooth, gather the toothpaste in your mouth and spit it
  out in the sink.
- Gurgle som water in your mouth, and spit that out aswell.
- Congratulations, you now have clean teeth.

2 - TWO KATAS

Complete the following two katas using TDD.

Make sure to follow the TDD mantra, “red-green-refactor”:
• Red: Write a failing test.
• Green: Write the smallest implementation to make your test pass.
• Refactor: Make the necessary refactoring to the implementation and tests,
in order to remove code redundancy

A fuller explanation of the TDD steps can be found here:
https://en.wikipedia.org/wiki/Test-driven_development

Remember, the point of these katas is not to solve the coding tasks as such. The point is to use TDD.
Thus, if your code contains a solution to the task, but no tests, the solution is not accepted.

2.1 FAHRENHEIT-TO-CELCIUS CONVERTER

Use TDD to create a fahrenheit-to-celcius converter.
Use TDD to extend it to a celcius-to-fahrenheit converter.

2.2 ROMAN NUMERAL KATA

Implement an “Arabic numeral to roman numeral” converter using TDD. Follow the
standard form of roman numerals – the rules can be found on the wikipedia page:
https://en.wikipedia.org/wiki/Roman_numerals#Standard_form.
You can test your converter against this online converter:
http://www.novaroma.org/via_romana/numbers.html.

3 - GIVE YOUR THOUGHTS ON TDD

Write your notes (in a readme file) regarding the TDD process, reflecting on the following questions.

• What was positive and good about using TDD?

Ved at skrive testen først, følte jeg at der allerede begyndte tanker omkring hvordan jeg skulle skrive
metoden, for at få den til at virke med testen.
Derudover var det ved opgave 2.2 nemmere at få testet om man havde fået taget højde for alle de
forskellige inputs der kunne komme, ved at have en omfattende test som kørte metoden med en række
forskellige inputs. Der fik jeg fundet en yderligere fejl ved min metode, som ellers måske ikke ville
være blevet opdaget.
Og ja, jeg ved godt at det ikke ligefrem blev til en yndefuld metode - men den virker! :D

• What was annoying or difficult?

Selve opsætningen af JUnit tog lidt tid at sætte sig ind i, men sådan er det jo med alt nyt.
Ved opgave 2.1 føltes det lidt spildt at skulle lave en hel test til en rimelig simpel matematisk
konvertering. Det tog nok 5 gange så lang tid at lave testen, som at implementere løsningen.

• What surprised you?

Er lidt overrasket over at jeg faktisk godt kan lide at arbejde med TDD. Har indtil nu tænkt at
det var spild af tid og sidde og lave tests til alle sine funktionaliteter i et program, men
jeg er nok blevet lidt klogere. For det bliver jo en del nemmere at kontrollere at alt stadig virker
efter hensigten, hvis der pludselig skal refaktureres.

• Did TDD help you write some tests you wouldn’t otherwise have thought of?

Som skrevet tidligere, så har min test af funktionerne nok været lidt mere omstændelige med TDD
i fokus. Oftest har jeg nok arbejdet mest med smoke tests, hvor jeg bare tester data'en der kommer
igennem via en GUI. Dette er nok ikke særlig hensigtsmæssigt ude i den virkelige verden, hvor man
sjældent sidder og både laver backend og frontend programmering på samme projekt.