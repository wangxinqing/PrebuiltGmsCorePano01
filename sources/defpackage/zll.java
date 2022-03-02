package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.URLSpan;
import com.google.android.gms.R;
import com.google.android.gms.plus.sharebox.MentionMultiAutoCompleteTextView;
import com.google.android.gms.plus.sharebox.MentionSpan;
import java.util.ArrayList;

/* renamed from: zll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zll implements TextWatcher {
    final /* synthetic */ MentionMultiAutoCompleteTextView a;
    private final zlm b = new zlm();

    public zll(MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView) {
        this.a = mentionMultiAutoCompleteTextView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            ArrayList a2 = this.a.a();
            boolean z = false;
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(i, (i2 + i) - 1, URLSpan.class)) {
                if (MentionSpan.a(uRLSpan)) {
                    spannable.removeSpan(uRLSpan);
                    z = true;
                }
            }
            if (z) {
                this.a.a(a2, this.a.a());
            }
        }
        float dimension = this.a.getContext().getResources().getDimension(R.dimen.plus_sharebox_mention_suggestion_popup_offset);
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.a;
        mentionMultiAutoCompleteTextView.setDropDownVerticalOffset((((int) dimension) + mentionMultiAutoCompleteTextView.b()) - this.a.getHeight());
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int selectionEnd = this.a.getSelectionEnd();
        MentionMultiAutoCompleteTextView mentionMultiAutoCompleteTextView = this.a;
        boolean z = true;
        if (this.b.findTokenStart(charSequence, selectionEnd) + 1 > selectionEnd) {
            z = false;
        }
        mentionMultiAutoCompleteTextView.a(z);
    }
}
