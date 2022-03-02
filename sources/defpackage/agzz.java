package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

/* renamed from: agzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzz {
    private final Context a;
    private final String b;
    private String c = "files";
    private String d = "common";
    private Account e = ahaa.b;
    private String f = "";
    private final amzt g = amzy.j();

    public agzz(Context context) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        ahbx.a(z, "Context cannot be null", new Object[0]);
        this.a = context;
        this.b = context.getPackageName();
    }

    private final void c(String str) {
        ahbx.a(ahaa.d.contains(str), "The only supported locations are %s: %s", ahaa.d, str);
        this.c = str;
    }

    public final Uri a() {
        String format = String.format("/%s/%s/%s/%s", new Object[]{this.c, this.d, agzv.a(this.e), this.f});
        return new Uri.Builder().scheme("android").authority(this.b).path(format).encodedFragment(ahbw.a((List) this.g.a())).build();
    }

    public final void b() {
        c("managed");
    }

    public final void b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = ahaa.a;
        this.f = str;
    }

    public final void a(Account account) {
        agzv.a(account);
        this.e = account;
    }

    public final void a(File file) {
        a(file.getAbsolutePath(), (agzt) null);
    }

    public final void a(String str) {
        ahbx.a(ahaa.a.matcher(str).matches(), "Module must be non-empty and [a-z]: %s", str);
        Object[] objArr = {str};
        ahbx.a(!ahaa.c.contains(str), "Module name is reserved and cannot be used: %s", objArr);
        this.d = str;
    }

    public final void a(String str, agzt agzt) {
        String str2;
        String str3;
        String str4;
        File a2 = agzy.a(this.a);
        String absolutePath = a2.getAbsolutePath();
        String absolutePath2 = this.a.getCacheDir().getAbsolutePath();
        String absolutePath3 = new File(a2, "managed").getAbsolutePath();
        String str5 = null;
        if (this.a.getExternalFilesDir((String) null) != null) {
            str2 = this.a.getExternalFilesDir((String) null).getAbsolutePath();
        } else {
            str2 = null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            File b2 = agzy.b(this.a);
            String absolutePath4 = new File(b2, "files").getAbsolutePath();
            str3 = new File(b2, "cache").getAbsolutePath();
            str5 = absolutePath4;
        } else {
            str3 = null;
        }
        if (str.startsWith(absolutePath3)) {
            c("managed");
            str4 = str.substring(absolutePath3.length());
        } else if (str.startsWith(absolutePath)) {
            c("files");
            str4 = str.substring(absolutePath.length());
        } else if (str.startsWith(absolutePath2)) {
            c("cache");
            str4 = str.substring(absolutePath2.length());
        } else if (str2 != null && str.startsWith(str2)) {
            c("external");
            str4 = str.substring(str2.length());
        } else if (str5 != null && str.startsWith(str5)) {
            c("directboot-files");
            str4 = str.substring(str5.length());
        } else if (str3 != null && str.startsWith(str3)) {
            c("directboot-cache");
            str4 = str.substring(str3.length());
        } else {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Path must be in app-private files dir or external files dir: ") : "Path must be in app-private files dir or external files dir: ".concat(valueOf));
        }
        List asList = Arrays.asList(str4.split(File.separator));
        boolean z = true;
        ahbx.a(asList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        a((String) asList.get(1));
        String str6 = (String) asList.get(2);
        if (!"managed".equals(this.c) || agzv.b(str6)) {
            a(agzv.a(str6));
        } else {
            try {
                int parseInt = Integer.parseInt(str6);
                if (agzt == null) {
                    z = false;
                }
                ahbx.a(z, "AccountManager cannot be null", new Object[0]);
                try {
                    a((Account) aorj.a((Future) aopr.a(((ahah) agzt).a.a(), (aoqb) new ahag(parseInt), (Executor) aoqm.a), ahbk.class));
                } catch (ahbk e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        b(str4.substring(this.d.length() + str6.length() + 2));
    }
}
