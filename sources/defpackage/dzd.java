package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: dzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzd extends AsyncTaskLoader {
    private final Context a;
    private final List b;
    private final String c;
    private final String d;
    private final dye e;
    private ArrayList f;
    private final dwj g;
    private final dzb h;

    public dzd(Context context, String str, String str2, LoaderSectionInfo loaderSectionInfo, dwj dwj, dye dye) {
        super(context);
        this.c = str;
        this.b = loaderSectionInfo.l;
        this.a = context;
        this.d = str2;
        this.e = dye;
        this.g = dwj;
        this.h = new dzb(loaderSectionInfo.b, loaderSectionInfo.c, false);
    }

    /* renamed from: a */
    public final void deliverResult(ArrayList arrayList) {
        dye dye = this.e;
        if (dye != null) {
            dye.f();
        }
        this.f = arrayList;
        if (isStarted()) {
            super.deliverResult(arrayList);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Account account = new Account(this.c, "com.google");
        ClientContext clientContext = new ClientContext();
        clientContext.b = Process.myUid();
        clientContext.d = account;
        clientContext.c = account;
        clientContext.e = this.d;
        clientContext.f = this.a.getPackageName();
        clientContext.a(new String[]{"https://www.googleapis.com/auth/plus.native"});
        ArrayList a2 = this.g.a(clientContext);
        if (a2 == null || a2.size() == 0) {
            List list = this.b;
            if (list != null) {
                return new ArrayList(list);
            }
            return new ArrayList();
        }
        eao eao = new eao();
        List list2 = this.b;
        if (list2 != null) {
            eao.a((Collection) list2);
        }
        for (int i = 0; i < a2.size(); i++) {
            this.h.a(((ContactPerson) a2.get(i)).e);
            if (((ContactPerson) a2.get(i)).e.size() > 0) {
                eao.a((ContactPerson) a2.get(i));
            }
        }
        return eao.a;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        this.f = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            deliverResult(arrayList);
        }
        if (takeContentChanged() || this.f == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
        super.onStopLoading();
    }
}
