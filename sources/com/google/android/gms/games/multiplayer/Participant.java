package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Player;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface Participant extends Parcelable, ilq {
    int a();

    String b();

    int c();

    boolean d();

    String e();

    Uri f();

    Uri g();

    @Deprecated
    String getHiResImageUrl();

    @Deprecated
    String getIconImageUrl();

    String h();

    Player i();

    ParticipantResult j();
}
