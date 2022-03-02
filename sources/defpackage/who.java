package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.Activity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: who  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class who {
    public static Account a(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
            return null;
        }
        return new Account(stringExtra, "com.google");
    }

    public static acwa b(Context context) {
        if (!ayni.k() || !jix.b(context)) {
            return acws.a((Executor) new jfz(1, 9), (Callable) new whl(context));
        }
        return acws.a(new Exception("AccountUtils#getSupportedAccounts: current device is a latchsky device."));
    }

    public static acwa c(Context context, Account account) {
        wlr wlr = new wlr();
        wlr.a = 80;
        return acws.a((Executor) new jfz(1, 9), (Callable) new whi(wlt.a(context, wlr.a()), account, context));
    }

    public static File a(Context context) {
        File file = new File(String.format("%s/%s", new Object[]{context.getFilesDir(), "nearby/sharing"}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File a(Context context, Account account, String str) {
        Object[] objArr = new Object[2];
        File file = new File(String.format("%s/%s", new Object[]{a(context).getAbsolutePath(), account.name}));
        if (!file.exists()) {
            file.mkdirs();
        }
        objArr[0] = file.getAbsolutePath();
        objArr[1] = str;
        return new File(String.format("%s/%s", objArr));
    }

    public static acwa b(Context context, Account account) {
        Context applicationContext = context.getApplicationContext();
        wlr wlr = new wlr();
        wlr.a = 80;
        iby d = wlt.d(applicationContext, wlr.a());
        jfz jfz = new jfz(1, 9);
        whg whg = new whg(d, account);
        if (!ayni.a.a().ap()) {
            return acws.a((Executor) jfz, (Callable) whg);
        }
        return acws.a((Executor) jfz, (Callable) new whh(whg, account));
    }

    static final /* synthetic */ ArrayList c(Context context) {
        ArrayList arrayList = new ArrayList(jgu.d(context, context.getPackageName()));
        if (!ayni.a.a().be()) {
            try {
                arrayList.removeAll(Arrays.asList(eig.a(context, "com.google", new String[]{aeea.a("usm")})));
            } catch (eif | IOException e) {
                anih anih = (anih) vvj.a.c();
                anih.a(e);
                ((anih) anih.a("who", "c", 394, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to remove unicorn accounts.");
                return new ArrayList();
            }
        }
        if (!ayni.M()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (Account account : (Account[]) qub.a(context).a("com.google", new String[]{"service_HOSTED"}).getResult()) {
                    if (!ayni.M()) {
                        if (!ayni.a.a().by() || !account.name.endsWith("@google.com")) {
                            arrayList2.add(account);
                        }
                    }
                }
                arrayList.removeAll(arrayList2);
            } catch (IOException e2) {
                anih anih2 = (anih) vvj.a.c();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("who", "c", 420, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to remove dasher accounts.");
                return new ArrayList();
            }
        }
        return arrayList;
    }

    public static String a(Context context, Account account) {
        try {
            return eig.c(context, account.name);
        } catch (eif | IOException e) {
            anih anih = (anih) vvj.a.b();
            anih.a(e);
            ((anih) anih.a("who", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to find obfuscated Gaia id for %s.", Objects.hashCode(account));
            return null;
        }
    }

    public static List a(Context context, String... strArr) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = a(context).listFiles();
        if (listFiles != null) {
            for (File listFiles2 : listFiles) {
                File[] listFiles3 = listFiles2.listFiles();
                if (listFiles3 != null) {
                    for (File file : listFiles3) {
                        if (file.exists()) {
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (strArr[i].equals(file.getName())) {
                                        arrayList.add(file);
                                        break;
                                    }
                                    i++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void b(Context context, String... strArr) {
        File[] listFiles;
        List a = a(context, strArr);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            File file = (File) a.get(i);
            file.delete();
            File parentFile = file.getParentFile();
            if (!(parentFile == null || (listFiles = parentFile.listFiles()) == null || listFiles.length > 0)) {
                parentFile.delete();
            }
        }
    }

    public static List a(Parcelable[] parcelableArr) {
        int length;
        if (parcelableArr == null || (length = parcelableArr.length) == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (Account account : parcelableArr) {
            if ("com.google".equals(account.type)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    public static void a(Account account, Activity activity) {
        acwa b = b(activity);
        b.a((acvv) new whj(account, activity));
        b.a(whk.a);
    }

    public static void a(Activity activity) {
        a((Account) null, activity);
    }

    static final /* synthetic */ void a(Exception exc) {
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        ((anih) anih.a("who", "a", 367, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a(" AccountPicker Activity failed to launch.");
    }
}
