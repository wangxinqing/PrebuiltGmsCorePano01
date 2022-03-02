package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import java.util.Iterator;
import java.util.List;

/* renamed from: ocs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocs implements TextWatcher {
    private final List a;
    private final MenuItem b;

    public ocs(List list, MenuItem menuItem) {
        this.a = list;
        this.b = menuItem;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((EditText) it.next()).addTextChangedListener(this);
        }
    }

    public final void a() {
        onTextChanged((CharSequence) null, 0, 0, 0);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        Iterator it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((EditText) it.next()).getText().toString().trim().isEmpty()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        this.b.setEnabled(z);
    }
}
