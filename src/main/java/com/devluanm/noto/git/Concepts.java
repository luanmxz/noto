package com.devluanm.noto.git;

public class Concepts {
	public static void main(String ...args) {
		System.out.println("""
			Git: Version Control System
			Git commit: A snapshot of a project's state, moves the HEAD to the new commit
			Git merge: Combines two branches into one, picking the last commited state of each branch and creating a new commit
				with two ancestrals.
			Git rebase: Reapplies the commits of the active branch on top of the targeted branch, producing a linear history on
				the target branch, without changing the history of the active branch. The original commit are not removed, but now it is
				an orphan commit, with no relationship to the active branch.
			Git rebase interactive: Using the -i parameter, git will open an editor to let you choose which commits to keep and discard
				and you have some options on how to handle the commits. You can squash commits (group them into one), edit the commits,
				pick or discard commits, change the commit message, etc. Is a good way to clean up the history of a project and organize the
				commits before a PR. Note: You cannot use this option if you have uncommitted changes.
			Git cherry-pick: You can select specific commits - e.g git cherry-pick C1 C2 to apply only those commits to the active branch.
			Git checkout <branch_name>: Switches the HEAD to the specified branch
			Git branch <branch_name>: Creates a new branch
			Git checkout -b <branch_name>: Creates a new branch and switches the HEAD to it
			Git reset: It go back in the history line, as if the HEAD was pointing to a specific commit. (only to you, other devs can't see it)
			Git revert: It creates a new commit that reverts the changes made in the specified commit. (push the revert to other devs)
			Moving in branches:
				- We can move using the branch name, the commit full hash, the commit partial hash (only the first characters necessary to
					identify the unique hash), the HEAD ancestrals (HEAD~3 - three ancestrals up, HEAD^ - one ancestral up),
					the branch ancestrals (branch_name~3 - three ancestrals up, branch_name^ - one ancestral up)
			""");
	}
}