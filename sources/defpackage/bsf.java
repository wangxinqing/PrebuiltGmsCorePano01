package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreference;
import java.util.ArrayList;

/* renamed from: bsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bsf extends bsh {
    public int a;
    private CharSequence[] c;
    private CharSequence[] d;

    private static void a(Bundle bundle, String str, CharSequence[] charSequenceArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (CharSequence charSequence : charSequenceArr) {
            arrayList.add(charSequence.toString());
        }
        bundle.putStringArrayList(str, arrayList);
    }

    private final ListPreference c() {
        return (ListPreference) b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference c2 = c();
            if (c2.h == null || c2.i == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.a = c2.b(c2.j);
            this.c = c2.h;
            this.d = c2.i;
            return;
        }
        this.a = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.c = a(bundle, "ListPreferenceDialogFragment.entries");
        this.d = a(bundle, "ListPreferenceDialogFragment.entryValues");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.a);
        a(bundle, "ListPreferenceDialogFragment.entries", this.c);
        a(bundle, "ListPreferenceDialogFragment.entryValues", this.d);
    }

    private static CharSequence[] a(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return (CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(sr srVar) {
        srVar.a(this.c, this.a, new bse(this));
        srVar.b((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final void a(boolean z) {
        int i;
        ListPreference c2 = c();
        if (z && (i = this.a) >= 0) {
            String charSequence = this.d[i].toString();
            if (c2.b((Object) charSequence)) {
                c2.a(charSequence);
            }
        }
    }
}
