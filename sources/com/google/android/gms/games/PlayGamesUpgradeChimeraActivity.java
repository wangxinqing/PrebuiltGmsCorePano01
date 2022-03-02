package com.google.android.gms.games;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlayGamesUpgradeChimeraActivity extends bsu {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME");
        if (stringExtra == null) {
            stringExtra = getPackageName();
        }
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.games.GAME_ID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("game_package_name", stringExtra);
        bundle2.putString("game_id", stringExtra2);
        nno nno = new nno();
        nno.setCancelable(false);
        nno.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("play_games_upgrade");
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.add((Fragment) nno, "play_games_upgrade");
        beginTransaction.commitAllowingStateLoss();
    }
}
