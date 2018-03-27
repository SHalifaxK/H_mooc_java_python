'''
Ympyrän kehän pituus lasketaan kaavalla 2 * pii * säde. Tee ohjelma, joka 
kysyy käyttäjältä ympyrän säteen ja laskee sen perusteella ympyrän kehän pituuden. 
Voit käyttää joko omaa muuttujaa piin arvon tallentamiseen, tai voit käyttää Javan/Pythonin valmiiksi 
tarjoamaa piin arvoa. Javan/Pythonin valmiin piin arvon saa käyttöön kirjoittamalla Math.PI laskutoimitukseen.

Anna ympyrän säde: 20
Ympyrän kehä: 125.66370614359172
'''
from math import pi

sade = int(input('Anna ympyran sade: '))
keha = 2*pi*sade
print('Ympyran keha: ' + str(keha))
