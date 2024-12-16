
for (int i = 0; i < set1.length; i++) {
    for (int x = 0; x < set2.length; x++) {
        if (set1[i] <= set2[i]) {
            return false;
        }
    }
}
return true;