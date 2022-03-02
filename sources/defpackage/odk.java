package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationTranscriptLayoutAdapter$1$1;

/* renamed from: odk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class odk implements InputFilter {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ ColorStateList c;
    public final /* synthetic */ ods d;

    public odk(ods ods, Context context, int i, ColorStateList colorStateList) {
        this.d = ods;
        this.a = context;
        this.b = i;
        this.c = colorStateList;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        SpannableString spannableString = new SpannableString(this.a.getString(R.string.gh_chat_offer_survey).toUpperCase());
        CharSequence charSequence2 = charSequence;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            oab a2 = oab.a(uRLSpan.getURL(), oal.a(), this.d.o.p, true, 2);
            if (a2 != null && a2.p()) {
                okg.b((nzu) this.d.o, 34, avmt.CHAT);
                int i5 = this.b;
                ColorStateList colorStateList = this.c;
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan((String) null, 1, i5, colorStateList, colorStateList);
                ChatConversationTranscriptLayoutAdapter$1$1 chatConversationTranscriptLayoutAdapter$1$1 = new ChatConversationTranscriptLayoutAdapter$1$1(this, uRLSpan.getURL());
                spannableStringBuilder.insert(spannableStringBuilder.getSpanStart(uRLSpan), "\n");
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableString);
                spannableStringBuilder.setSpan(textAppearanceSpan, spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 0);
                spannableStringBuilder.setSpan(chatConversationTranscriptLayoutAdapter$1$1, 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.removeSpan(uRLSpan);
            }
        }
        return spannableStringBuilder;
    }
}
