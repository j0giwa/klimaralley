# klimaralley

# Project Struckture
![structure diagramm](https://github.com/j0giwa/klimaralley/blob/master/doc/server_archtecture_diagram.drawio.png?raw=true)

- database
- klimaralley-server (central backendserver)
- klimaralley-hub (main-app that connects the games)
- klimaralley-recycling (recycling game)
- klimaralley-wasserarm (wasserarm-satt game)

# stack

## frontend
- vite
- react
- tailwind
- daisyui

## backend
- spring boot

# Development 
A short explanation on how to work on this repository, if you never worked with submodules before.
A submodule is in a nutshell a Git repostory inside another Git repository, their state is tracked seperately.

## Cloning
Because this repository that contains submodules, you need to take an extra step to ensure that the submodules are also cloned (downloaded).
This is done using the `--recurse-submodules` flag:
```
git clone --recurse-submodules https://github.com/j0giwa/klimaralley
```
This command clones the main repository along with all its submodules.
If for some reason the submodules weren't cloned, you can initialize and update them manually:
```
git submodule update --init
```

## Commiting
One thing to keep in mind is that if you make changes to a submodule, those changes are not automatically reflected in the main repository.
You need to explicitly commit the new version of the submodule to the main repository.
```
cd .. # go to main-repository
git add submodule # replace 'submodule' with the name of the submodule (obviously)
git commit -m "Updated submodule to latest version"
```
By doing this, you're telling Git that the submodule is now at a new state, and you want to record that change in the main repository.
