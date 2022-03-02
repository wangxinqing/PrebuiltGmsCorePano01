package defpackage;

import android.location.Location;

/* renamed from: ahyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyi {
    public static boolean a(Location location) {
        return "gps".equals(location.getProvider()) && location.getExtras() != null && location.getExtras().getInt("SourceType") == 128;
    }
}
