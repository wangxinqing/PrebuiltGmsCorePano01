package defpackage;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ptu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptu extends AsyncTask {
    final /* synthetic */ pub a;

    public ptu(pub pub) {
        this.a = pub;
    }

    /* access modifiers changed from: protected */
    public final ptt a() {
        aajk a2 = aafi.a(this.a.a);
        iha b = ihb.b();
        b.a = new aaka();
        acwa a3 = ((iby) a2).a(b.a());
        ptt ptt = new ptt();
        try {
            GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr = (GetGlobalSearchSourcesCall$GlobalSearchSource[]) acws.a(a3, 15, TimeUnit.SECONDS);
            ptt.a = 0;
            ArrayList arrayList = new ArrayList();
            ptv ptv = null;
            for (GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource : getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
                if (!getGlobalSearchSourcesCall$GlobalSearchSource.a.equals("com.google.android.gms")) {
                    ptv ptv2 = new ptv(this.a.a);
                    try {
                        ptv2.a((CharSequence) this.a.c.getApplicationLabel(this.a.c.getApplicationInfo(getGlobalSearchSourcesCall$GlobalSearchSource.a, 0)).toString());
                        ptv2.a(this.a.c.getApplicationIcon(getGlobalSearchSourcesCall$GlobalSearchSource.a));
                        ptv2.k = getGlobalSearchSourcesCall$GlobalSearchSource.a;
                        ptv2.b((CharSequence) getGlobalSearchSourcesCall$GlobalSearchSource.b);
                        ptv2.setChecked(getGlobalSearchSourcesCall$GlobalSearchSource.j);
                        ptv2.a((jmb) this.a.h);
                        ptv2.a(Integer.MIN_VALUE);
                        arrayList.add(ptv2);
                        if (ptv == null || ((String) ptv2.c).compareTo((String) ptv.c) > 0) {
                            ptv = ptv2;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        String valueOf = String.valueOf(getGlobalSearchSourcesCall$GlobalSearchSource.a);
                        oso.a(valueOf.length() == 0 ? new String("Application not found in PackageManager: ") : "Application not found in PackageManager: ".concat(valueOf));
                    }
                }
            }
            if (ptv != null) {
                ptv.l = true;
            }
            ptx ptx = new ptx(this.a.a);
            ptx.a((CharSequence) "");
            ptx.c(R.string.on_device_sharing_ui_description);
            int i = Build.VERSION.SDK_INT;
            ptx.a(ptx.d.getDrawable(R.drawable.quantum_ic_info_outline_grey600_24));
            ptx.a(Integer.MAX_VALUE);
            arrayList.add(ptx);
            ptt.b = arrayList;
            return ptt;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            if (e2.getCause() instanceof ibr) {
                ptt.a = ((ibr) e2.getCause()).a();
            } else {
                ptt.a = 8;
            }
            return ptt;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return a();
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        ptt ptt = (ptt) obj;
        pub pub = this.a;
        if (pub.b) {
            MaterialProgressBar materialProgressBar = pub.e;
            if (!materialProgressBar.a()) {
                materialProgressBar.setVisibility(4);
            } else {
                Drawable b = materialProgressBar.b();
                if (b instanceof aeoj) {
                    ((aeoj) b).a(new aeoy(materialProgressBar));
                } else {
                    materialProgressBar.setVisibility(4);
                }
            }
            if (ptt.a == 0) {
                if (ptt.b.size() != 1 || !(ptt.b.get(0) instanceof ptx)) {
                    List list = ptt.b;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.a.i.a((jmc) list.get(i));
                    }
                } else {
                    this.a.f.setVisibility(0);
                    pub pub2 = this.a;
                    pub2.d.a(pub2.i);
                }
                this.a.j;
                return;
            }
            this.a.g.setVisibility(0);
            this.a.j;
        }
    }

    public final void onPreExecute() {
        pub pub = this.a;
        if (pub.b) {
            pub.j;
            this.a.f.setVisibility(8);
            this.a.g.setVisibility(8);
            this.a.e.c();
        }
    }
}
