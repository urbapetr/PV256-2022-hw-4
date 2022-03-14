# Homework 4

1. Follow instructions in [wiki](https://gitlab.fi.muni.cz/grp-pv256/wiki/wikis/home)
and proceed with forking this repo
2. In `MainActivity::onCreate` implement onClickListeners for Buttons
   * MainActivity mustn't implement any business logic, delegate it to `MainActivityViewModel`
3. Finish implementation of `MainActivityViewModel`
   * Use SavedStateHandle to save count value
   * Communicate with MainActivity via `data` LiveData
4. Submit changes into a **submit** branch and push it to your forked repo
5. Create a merge request against _your_ master branch and assign it to **xsevci11**, **ext-stefan.krajanec**, **xpanek1**, **xmasa**

Your commit must pass Gitlab CI verification. To test this locally, run:
```
./gradlew check
```
