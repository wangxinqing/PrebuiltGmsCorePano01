package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* renamed from: bsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bsd extends bsh {
    private EditText a;
    private CharSequence c;

    private final EditTextPreference c() {
        return (EditTextPreference) b();
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        super.a(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.a = editText;
        if (editText != null) {
            editText.setText(this.c);
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.c = c().g;
        } else {
            this.c = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.c);
    }

    public final void a(boolean z) {
        if (z) {
            String obj = this.a.getText().toString();
            if (c().b((Object) obj)) {
                c().a(obj);
            }
        }
    }
}
