package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;

/* renamed from: zmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmc implements TextWatcher {
    final /* synthetic */ zme a;
    private final zlm b = new zlm();
    private final int c;

    public zmc(zme zme, Resources resources) {
        this.a = zme;
        this.c = (int) resources.getDimension(R.dimen.plus_sharebox_mention_suggestion_min_space);
    }

    public final void afterTextChanged(Editable editable) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.a.getActivity() != null) {
            zme zme = this.a;
            if (zme.f != null && (mentionMultiAutoCompleteTextView = zme.i) != null) {
                String obj = mentionMultiAutoCompleteTextView.getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    if (this.a.d.j().h()) {
                        this.a.b = true;
                    }
                } else if (!this.a.d.j().h() || !this.a.d.j().s.equals(obj)) {
                    this.a.b = true;
                }
                zme zme2 = this.a;
                if (zme2.b && !zme2.a) {
                    zme2.d.g().a(iax.k);
                    this.a.a = true;
                }
                this.a.d.p();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.a.getActivity() != null) {
            zme zme = this.a;
            if (zme.f != null && (mentionMultiAutoCompleteTextView = zme.i) != null) {
                int selectionEnd = mentionMultiAutoCompleteTextView.getSelectionEnd();
                if (this.b.findTokenStart(charSequence, selectionEnd) + this.a.i.getThreshold() <= selectionEnd) {
                    int[] iArr = new int[2];
                    this.a.i.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    this.a.f.getWindowVisibleDisplayFrame(rect);
                    if (rect.height() - (iArr[1] + this.a.i.b()) < this.c) {
                        zme zme2 = this.a;
                        zme2.g.smoothScrollTo(0, zme2.i.c());
                    }
                }
            }
        }
    }
}
