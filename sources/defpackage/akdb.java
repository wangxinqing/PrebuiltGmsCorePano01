package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class akdb extends oz {
    private final TextInputLayout b;

    public akdb(TextInputLayout textInputLayout) {
        this.b = textInputLayout;
    }

    public void a(View view, qs qsVar) {
        Editable editable;
        boolean z;
        String str;
        String str2;
        TextView textView;
        qs qsVar2 = qsVar;
        super.a(view, qsVar);
        EditText editText = this.b.a;
        CharSequence charSequence = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence a = this.b.a();
        CharSequence e = this.b.e();
        CharSequence d = this.b.d();
        TextInputLayout textInputLayout = this.b;
        int i = textInputLayout.c;
        if (textInputLayout.b && textInputLayout.d && (textView = textInputLayout.e) != null) {
            charSequence = textView.getContentDescription();
        }
        boolean z2 = !TextUtils.isEmpty(editable);
        boolean z3 = !TextUtils.isEmpty(a);
        boolean z4 = !TextUtils.isEmpty(e);
        boolean isEmpty = TextUtils.isEmpty(d);
        boolean z5 = !isEmpty;
        if (z5 || !TextUtils.isEmpty(charSequence)) {
            z = true;
        } else {
            z = false;
        }
        if (!z3) {
            str = "";
        } else {
            str = a.toString();
        }
        String valueOf = String.valueOf(str);
        if ((!z5 && !z4) || TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = ", ";
        }
        String valueOf2 = String.valueOf(str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
        if (z5) {
            e = d;
        } else if (!z4) {
            e = "";
        }
        String valueOf3 = String.valueOf(e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf2);
        sb.append(valueOf3);
        String sb2 = sb.toString();
        if (z2) {
            qsVar2.b((CharSequence) editable);
        } else if (!TextUtils.isEmpty(sb2)) {
            qsVar2.b((CharSequence) sb2);
        }
        if (!TextUtils.isEmpty(sb2)) {
            if (Build.VERSION.SDK_INT >= 26) {
                qsVar2.e((CharSequence) sb2);
            } else {
                if (z2) {
                    String valueOf4 = String.valueOf(editable);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 2 + String.valueOf(sb2).length());
                    sb3.append(valueOf4);
                    sb3.append(", ");
                    sb3.append(sb2);
                    sb2 = sb3.toString();
                }
                qsVar2.b((CharSequence) sb2);
            }
            boolean z6 = true ^ z2;
            if (Build.VERSION.SDK_INT >= 26) {
                qsVar2.a.setShowingHintText(z6);
            } else {
                qsVar2.a(4, z6);
            }
        }
        if (editable == null || editable.length() != i) {
            i = -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        qsVar2.a.setMaxTextLength(i);
        if (z) {
            if (isEmpty) {
                d = charSequence;
            }
            int i3 = Build.VERSION.SDK_INT;
            qsVar2.a.setError(d);
        }
    }
}
