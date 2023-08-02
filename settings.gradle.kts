plugins {
	id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.1.9"
}

gitHooks {
    commitMsg { conventionalCommits() }
    createHooks()
}
