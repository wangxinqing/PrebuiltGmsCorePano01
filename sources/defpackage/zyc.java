package defpackage;

import android.text.TextUtils;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: zyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyc implements acvv {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ zyg c;

    public zyc(zyg zyg, String str, String str2) {
        this.c = zyg;
        this.a = str;
        this.b = str2;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zyi zyi;
        String str;
        Void voidR = (Void) obj;
        zyg zyg = this.c;
        String str2 = this.a;
        String str3 = this.b;
        zsi.a().a(3);
        long currentTimeMillis = System.currentTimeMillis();
        Map map = (Map) zyg.b.c.get(str2);
        zyi zyi2 = null;
        if (map != null) {
            zyi = (zyi) map.get(str3);
        } else {
            zyi = null;
        }
        if (zyi != null) {
            zyi.m = currentTimeMillis;
            zyi2 = zyi;
        }
        if (zyi2 != null) {
            zxg zxg = zyg.a.b;
            if (TextUtils.equals(zxg.e, str2)) {
                int i = 0;
                while (i < zxg.g.size()) {
                    zyi zyi3 = (zyi) zxg.g.get(i);
                    if (azfh.c()) {
                        str = zyk.a(zyi3);
                    } else {
                        str = zyi3.a;
                    }
                    if (!TextUtils.equals(str, str3)) {
                        i++;
                    } else {
                        if (zyi2.a() || azfh.e()) {
                            long j = zyi2.m;
                            ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = zxg.a;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(str).length());
                            sb.append("restore_time__");
                            sb.append(str2);
                            sb.append(str);
                            acws.a((Executor) jfm.b(9), (Callable) new zxm(contactsRestoreSettingsChimeraActivity, sb.toString(), Long.valueOf(j)));
                        }
                        zyi3.m = zyi2.m;
                        zxg.K(i + 4);
                        return;
                    }
                }
            }
        }
    }
}
