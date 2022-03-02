package defpackage;

import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: ixa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ixa {
    public static AudienceMember a(wzs wzs) {
        if (wzs.e() == -1) {
            return AudienceMember.b(wzs.c(), wzs.d());
        }
        return AudienceMember.c(wzs.c(), wzs.d());
    }

    public static AudienceMember a(xfj xfj) {
        return AudienceMember.b(xfj.a(), xfj.c(), xfj.d());
    }

    public static xfj a(AudienceMember audienceMember) {
        return new iwz(audienceMember);
    }
}
