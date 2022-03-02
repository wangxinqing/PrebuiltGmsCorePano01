package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Player;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface Event extends Parcelable, ilq {
    String a();

    String b();

    String c();

    Uri d();

    Player e();

    long f();

    String g();

    @Deprecated
    String getIconImageUrl();

    boolean h();
}
