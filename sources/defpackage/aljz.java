package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aljz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljz {
    private static final alkd a = new alkd("LogsUploader");
    private final Context b;
    private final String c;

    public aljz(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public static boolean a(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) == 1;
    }

    public final boolean a(String str) {
        File file;
        List<byte[]> list;
        String str2;
        if (!a(this.b)) {
            a.b("User setup isn't completed yet.");
            return false;
        }
        aljy a2 = aljy.a(this.b);
        if (new alju(this.b).a()) {
            if (str != null) {
                file = new File(a2.c, str);
                aljy.a(file);
            } else {
                file = a2.c;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || (r3 = listFiles.length) == 0) {
                aljy.a.a("No events available for subdirectory");
                list = Collections.emptyList();
            } else {
                list = new ArrayList<>();
                for (File a3 : listFiles) {
                    byte[] a4 = aljt.a(a3);
                    if (a4 != null) {
                        list.add(a4);
                    }
                }
            }
            if (list != null && !list.isEmpty()) {
                alkd alkd = a;
                int size = list.size();
                String str3 = "root";
                if (str == null) {
                    str2 = str3;
                } else {
                    str2 = str;
                }
                StringBuilder sb = new StringBuilder(str2.length() + 57);
                sb.append("Publishing ");
                sb.append(size);
                sb.append(" logs under ");
                sb.append(str2);
                sb.append(" directory to clearcut.");
                alkd.a(sb.toString());
                hol hol = new hol(this.b, this.c, (String) null);
                for (byte[] bArr : list) {
                    if (bArr != null) {
                        hol.a(bArr).b();
                    }
                }
                alkd alkd2 = a;
                if (str != null) {
                    str3 = str;
                }
                StringBuilder sb2 = new StringBuilder(str3.length() + 31);
                sb2.append("Logs of ");
                sb2.append(str3);
                sb2.append(" published and cleared.");
                alkd2.a(sb2.toString());
                a2.a(str);
                return true;
            }
            a.a("No persisted metrics found.");
            return false;
        }
        a.a("User did not optin for usage reporting.");
        aljt.b(a2.c);
        return false;
    }
}
