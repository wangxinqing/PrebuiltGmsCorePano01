package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

/* renamed from: dyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyz extends AsyncTaskLoader {
    private final String a;
    private final String b;
    private ArrayList c;
    private final icc d;

    public dyz(Context context, String str, LoaderSectionInfo loaderSectionInfo) {
        super(context);
        this.a = str;
        this.b = loaderSectionInfo.d;
        wlr a2 = wls.a();
        a2.a = 80;
        wls a3 = a2.a();
        ibz ibz = new ibz(context.getApplicationContext());
        ibz.a(this.a);
        ibz.a(wlt.a, (ibj) a3);
        this.d = ibz.b();
    }

    /* renamed from: a */
    public final void deliverResult(ArrayList arrayList) {
        this.c = arrayList;
        if (isStarted()) {
            super.deliverResult(this.c);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        if (TextUtils.isEmpty(this.b) || !this.d.f().b()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String[] split = this.b.split(":");
        for (int i = 0; i < split.length; i++) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                ibq ibq = wlt.a;
                icc icc = this.d;
                String str = this.a;
                wkx wkx = new wkx();
                wkx.a = parseInt;
                wky wky = (wky) xco.a(icc, str, (String) null, wkx).a();
                if (wky.aO() != null && wky.aO().c()) {
                    xfe b2 = wky.b();
                    for (int i2 = 0; i2 < b2.a(); i2++) {
                        wzs b3 = b2.a(i2);
                        String d2 = b3.d();
                        String c2 = b3.c();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new ContactPerson.ContactMethod(3, c2));
                        arrayList.add(new ContactPerson(d2, (String) null, (AvatarReference) null, arrayList2));
                    }
                    b2.c();
                }
                wky.c();
            } catch (NumberFormatException e) {
            }
        }
        this.d.g();
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        this.c = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            deliverResult(arrayList);
        }
        if (takeContentChanged() || this.c == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
        this.d.g();
    }
}
