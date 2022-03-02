package defpackage;

import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: maj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class maj {
    private final Context a;
    private final maw b;
    private final String c;

    public maj(Context context, maw maw) {
        this.a = context;
        this.b = maw;
        String b2 = lyq.b(context);
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 83);
        sb.append(b2);
        sb.append("/androidantiabuse/v1/x/create?alt=PROTO&key=AIzaSyBofcZsgLSS7BOnBjZPEkk4rYwzOIz-lTI");
        this.c = sb.toString();
        lyq.a(context);
    }

    public final mai a(String str) {
        int i;
        mai mai = new mai(str);
        aucd aucd = mai.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        lyd lyd = (lyd) aucd.b;
        lyd lyd2 = lyd.p;
        "20.12.16 (080306-{{cl}})".getClass();
        lyd.a |= 4;
        lyd.e = "20.12.16 (080306-{{cl}})";
        try {
            Collection allModules = ModuleManager.get(this.a).getAllModules();
            if (allModules != null && !allModules.isEmpty()) {
                Iterator it = allModules.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                    if (moduleInfo.moduleId.equals("com.google.android.gms.droidguard")) {
                        i = moduleInfo.moduleVersion;
                        break;
                    }
                }
            }
        } catch (InvalidConfigException e) {
        }
        i = 0;
        if (i != 0) {
            aucd aucd2 = mai.a;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            lyd lyd3 = (lyd) aucd2.b;
            lyd3.a |= 8;
            lyd3.f = i;
        }
        boolean a2 = jix.a(this.a);
        aucd aucd3 = mai.a;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        lyd lyd4 = (lyd) aucd3.b;
        lyd4.a |= 32;
        lyd4.h = a2;
        boolean b2 = jgu.b(this.a);
        aucd aucd4 = mai.a;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        lyd lyd5 = (lyd) aucd4.b;
        lyd5.a |= 16;
        lyd5.g = b2;
        return mai;
    }

    public final mar a(lyd lyd) {
        return a(lyd, (opp) null);
    }

    /* access modifiers changed from: package-private */
    public final mar a(lyd lyd, opp opp) {
        lye lye = (lye) aucj.a((aucj) lye.c, lyq.a(this.c, lyd.au(), opp));
        maw maw = this.b;
        lyj lyj = lyd.b;
        if (lyj == null) {
            lyj = lyj.d;
        }
        String str = lyj.b;
        return new mar(maw, lye);
    }
}
