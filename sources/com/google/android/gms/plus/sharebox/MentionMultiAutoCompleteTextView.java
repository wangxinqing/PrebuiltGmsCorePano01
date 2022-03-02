package com.google.android.gms.plus.sharebox;

import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MentionMultiAutoCompleteTextView extends MultiAutoCompleteTextView {
    private zlk a;
    private yqd b;

    public MentionMultiAutoCompleteTextView(Context context) {
        super(context);
    }

    private static final CharSequence a(String str, String str2) {
        String valueOf = String.valueOf(str);
        SpannableString spannableString = new SpannableString(valueOf.length() == 0 ? new String("+") : "+".concat(valueOf));
        if (!TextUtils.isEmpty(str2)) {
            spannableString.setSpan(new MentionSpan(str2), 0, spannableString.length(), 33);
        }
        return spannableString;
    }

    public final int b() {
        Layout layout = getLayout();
        if (layout != null) {
            return layout.getLineBaseline(layout.getLineForOffset(getSelectionEnd()));
        }
        return 0;
    }

    public final int c() {
        Layout layout = getLayout();
        if (layout != null) {
            return layout.getLineTop(layout.getLineForOffset(getSelectionEnd()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final CharSequence convertSelectionToString(Object obj) {
        try {
            if (obj instanceof xfj) {
                xfj xfj = (xfj) obj;
                return a(xfj.c(), xfj.a());
            }
            if (obj instanceof AudienceMember) {
                AudienceMember audienceMember = (AudienceMember) obj;
                if (audienceMember.c()) {
                    return a(audienceMember.f, audienceMember.e);
                }
            }
            return super.convertSelectionToString(obj);
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zlk zlk = this.a;
        if (zlk != null) {
            zlk.e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zlk zlk = this.a;
        if (zlk != null) {
            zlk.f();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        Editable editableText = getEditableText();
        for (URLSpan uRLSpan : (URLSpan[]) editableText.getSpans(0, editableText.length(), URLSpan.class)) {
            if (MentionSpan.a(uRLSpan)) {
                MentionSpan mentionSpan = new MentionSpan(uRLSpan);
                int spanStart = editableText.getSpanStart(uRLSpan);
                int spanEnd = editableText.getSpanEnd(uRLSpan);
                int spanFlags = editableText.getSpanFlags(uRLSpan);
                editableText.removeSpan(uRLSpan);
                editableText.setSpan(mentionSpan, spanStart, spanEnd, spanFlags);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void replaceText(CharSequence charSequence) {
        ArrayList a2 = a();
        super.replaceText(charSequence);
        a(a2, a());
        a(false);
    }

    public MentionMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final ArrayList a() {
        Editable text = getText();
        int length = text.length();
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, text.length(), MentionSpan.class);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int length2 = mentionSpanArr.length;
        for (int i = 0; i < length2; i++) {
            String substring = mentionSpanArr[i].getURL().substring(1);
            if (!hashSet.contains(substring)) {
                hashSet.add(substring);
                String charSequence = text.subSequence(text.getSpanStart(mentionSpanArr[i]), Math.min(length, text.getSpanEnd(mentionSpanArr[i]) + 1)).toString();
                boolean startsWith = charSequence.startsWith("+");
                if (startsWith) {
                    charSequence = charSequence.substring(1);
                }
                AudienceMember b2 = AudienceMember.b(substring, charSequence, (String) null);
                b2.h.putBoolean("checkboxEnabled", !startsWith);
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    public MentionMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(LoaderManager loaderManager, String str, String str2, String str3, String str4, yqd yqd) {
        this.b = yqd;
        zlk zlk = new zlk(getContext(), loaderManager, str, str2, str3, str4, this.b);
        this.a = zlk;
        setAdapter(zlk);
        setTokenizer(new zlm());
        setThreshold(3);
        this.a.e();
        addTextChangedListener(new zll(this));
        a(false);
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        yqd yqd = this.b;
        if (yqd != null) {
            Audience audience = yqd.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet(audience.b);
            linkedHashSet.addAll(arrayList2);
            iww iww = new iww(audience);
            iww.a((Collection) linkedHashSet);
            yqd.a(iww.a(), this);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AudienceMember audienceMember = (AudienceMember) arrayList.get(i);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (audienceMember.equals(arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    } else {
                        yqd yqd2 = this.b;
                        yqd2.a(ixb.b(yqd2.a, audienceMember), this);
                        break;
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        jla jla;
        int inputType = getInputType();
        Context context = getContext();
        if (jla.a == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            int i3 = 0;
            if (!(i == 0 || i2 == 0 || displayMetrics.density == 0.0f)) {
                float f = displayMetrics.density;
                float f2 = ((float) i2) / displayMetrics.density;
                if (((float) i) / f >= 550.0f && f2 >= 550.0f) {
                    i3 = 1;
                }
            }
            context.getResources().getDimension(R.dimen.common_screen_metrics_margin_percentage);
            Math.min(i, i2);
            Math.min(i2, i);
            Math.max(i2, i);
            jla.a = new jla(i3);
            jla = jla.a;
        } else {
            jla = jla.a;
        }
        int i4 = (getResources().getConfiguration().orientation == 1 || jla.b == 1 || !z) ? -65537 & inputType : 65536 | inputType;
        if (inputType != i4) {
            setRawInputType(i4);
            InputMethodManager a2 = jjw.a(getContext());
            if (a2 != null) {
                a2.restartInput(this);
            }
        }
    }
}
