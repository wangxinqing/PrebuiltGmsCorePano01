package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: okd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class okd implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final aoru c;
    private final List d;

    public okd(Context context, GoogleHelp googleHelp, aoru aoru, List list) {
        this.a = context;
        this.b = googleHelp;
        this.c = aoru;
        this.d = list;
    }

    public final void run() {
        Context context = this.a;
        GoogleHelp googleHelp = this.b;
        okj.a(context.getApplicationContext(), HelpConfig.a(googleHelp, context), (Account) null, this.c, this.d);
    }
}
