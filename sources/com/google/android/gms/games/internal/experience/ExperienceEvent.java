package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Game;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ExperienceEvent extends Parcelable, ilq {
    String a();

    Game b();

    String c();

    String d();

    Uri e();

    long f();

    long g();

    @Deprecated
    String getIconImageUrl();

    long h();

    int i();

    int j();
}
