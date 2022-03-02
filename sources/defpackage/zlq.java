package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;

/* renamed from: zlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zlq implements TextWatcher {
    final /* synthetic */ zls a;
    private final zlm b = new zlm();
    private final int c;

    public zlq(zls zls, Resources resources) {
        this.a = zls;
        this.c = (int) resources.getDimension(R.dimen.plus_sharebox_mention_suggestion_min_space);
    }

    public final void afterTextChanged(Editable editable) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.a.getActivity() != null) {
            zls zls = this.a;
            if (zls.d != null && (mentionMultiAutoCompleteTextView = zls.f) != null) {
                if (!TextUtils.isEmpty(mentionMultiAutoCompleteTextView.getText())) {
                    zls zls2 = this.a;
                    zls2.b = true;
                    if (!zls2.a) {
                        zls2.c.b().a(iax.k);
                        this.a.a = true;
                    }
                }
                this.a.c.f();
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView;
        if (this.a.getActivity() != null) {
            zls zls = this.a;
            if (zls.d != null && (mentionMultiAutoCompleteTextView = zls.f) != null) {
                int selectionEnd = mentionMultiAutoCompleteTextView.getSelectionEnd();
                if (this.b.findTokenStart(charSequence, selectionEnd) + this.a.f.getThreshold() <= selectionEnd) {
                    int[] iArr = new int[2];
                    this.a.f.getLocationOnScreen(iArr);
                    Rect rect = new Rect();
                    this.a.d.getWindowVisibleDisplayFrame(rect);
                    if (rect.height() - (iArr[1] + this.a.f.b()) < this.c) {
                        zls zls2 = this.a;
                        zls2.e.smoothScrollTo(0, zls2.f.c());
                    }
                }
            }
        }
    }
}
