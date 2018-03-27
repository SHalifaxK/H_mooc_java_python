'''
Tee ohjelma, joka kysyy käyttäjältä vuosilukua. Jos käyttäjä syöttää luvun, 
joka on pienempi kuin 2015, ohjelma tulostaa merkkijonon "Wanha!".

Anna vuosiluku: 2017

Anna vuosiluku: 2013
'''
vuosi = int(input('Anna vuosiluku: '))
if vuosi < 2015:
    print('Wanha')
else:
    pass
