package defpackage;

import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: abzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abzv implements acvf {
    private final abzy a;
    private final int b;

    public abzv(abzy abzy, int i) {
        this.a = abzy;
        this.b = i;
    }

    public final Object a(acwa acwa) {
        String str;
        byte[] a2;
        int length;
        abzy abzy = this.a;
        int i = this.b;
        Exception e = acwa.e();
        if (!(e instanceof ibr) || ((ibr) e).a() != 10501) {
            if (acwa.b()) {
                str = (String) acwa.d();
            } else {
                str = "";
            }
            String str2 = null;
            if (azkf.a.a().d() && (a2 = jhg.a(Long.toString(jhg.a(abzy.c)), "SHA1")) != null && (length = a2.length) >= 2) {
                byte[] bArr = new byte[2];
                bArr[1] = a2[length - 1];
                bArr[0] = (byte) (a2[length - 2] & 3);
                str2 = jjp.a(bArr);
            }
            return new WorkProfilePayload(str, i - 1, str2);
        }
        throw e;
    }
}
