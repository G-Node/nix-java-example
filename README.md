# NIX Java example

Example java project to demonstrate nix-java

Build with:
```bash
mvn package
```

Execute with:
```bash
java -jar target/nj-example-1.0-SNAPSHOT.jar
```

This should produce a file called `test.nix`
that can for example be inspected with with
`nix-tool`:

```bash
→ nix-tool dump test.nix

file &test.nix:
    location: test.nix
    createdAt: Sat Feb 16 16:16:16 2016
    updatedAt: Sat Feb 16 16:16:16 2016
    format: nix
    version: [1, 00]
  ...
```

Currently the correct [nix-java](https://github.com/G-Node/nix-java)
version might not be in maven central. If so it is easy to build
yourself (e.g. for mac homebrew):

```bash
# install nixio vie homebrew science
brew install homebrew/science/nixio

# get nix-java, build it and deploy it locally
git clone https://github.com/G-Node/nix-java.git
cd nix-java
mvn install -DnixIncludePath=/usr/local/include/ -DnixLinkPath=/usr/local/lib/ -Dhdf5LinkPath=/usr/local/lib
```
