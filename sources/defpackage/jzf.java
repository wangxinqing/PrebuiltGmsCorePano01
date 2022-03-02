package defpackage;

import com.google.android.gms.common.api.Scope;

@Deprecated
/* renamed from: jzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzf {
    public static final Scope a = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope b = new Scope("https://www.googleapis.com/auth/drive.apps");
    @Deprecated
    public static final ibq c = new ibq("Drive.API", g, f);
    public static final ibq d = new ibq("Drive.INTERNAL_API", h, f);
    @Deprecated
    public static final jzg e = new kux();
    public static final ibg f = new ibg();
    private static final ibn g = new jyz();
    private static final ibn h = new jza();
    private static final ibn i = new jzb();

    static {
        new Scope("https://www.googleapis.com/auth/drive.file");
        new Scope("https://www.googleapis.com/auth/drive.appdata");
        new ibq("Drive.API_CONNECTIONLESS", i, f);
    }
}
