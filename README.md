To reproduce the bug, checkout this repo somewhere, run a simple gradle task like `./gradlew tasks` and observe that it succeeds.

Then add a new detached git worktree with `git worktree add -d ../repro-detached`, cd into that directory with `cd ../repro-detached` and run `./gradlew tasks`. It now fails.
