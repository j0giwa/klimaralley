# klimaralley




# Development 
A short explanation how to work on this repo if you never worked with submodules before.
A submodule is a gitrepostory inside a gitrepository, their state is tracked seperately.

## Cloning
Because this repository that contains submodules, you need to take an extra step to ensure that the submodules are also cloned.
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
git add submodule
git commit -m "Updated submodule to latest version"
```
By doing this, you're telling Git that the submodule is now at a new state, and you want to record that change in the main repository.
