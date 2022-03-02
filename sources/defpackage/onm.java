package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.ActivityBase;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.HashSet;
import org.json.JSONException;

/* renamed from: onm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onm extends ahu implements View.OnClickListener {
    public static final String[] a = {"_id", "suggest_format", "suggest_text_1", "suggest_text_2_url", "suggest_intent_query", "help_action_string"};
    final oar j;
    private final nzu k;
    private final HelpConfig l;
    private final aoru m;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private final one q;

    public onm(nzu nzu, one one, aoru aoru) {
        super((Context) nzu, false);
        this.k = nzu;
        this.l = nzu.f();
        this.j = nzu.j();
        this.q = one;
        this.m = aoru;
    }

    public static String a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            String name = e.getClass().getName();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
            sb.append(name);
            sb.append(": ");
            sb.append(message);
            Log.e("gH_SuggestionsAdaptr", sb.toString(), e);
            return null;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            CharSequence b = this.q.b();
            this.q.a((CharSequence) tag, false);
            okg.a(this.k, b);
        }
    }

    static final void a(MatrixCursor matrixCursor, int i, omv omv) {
        matrixCursor.addRow(new Object[]{Integer.valueOf(i), Integer.valueOf(omv.a), omv.b, omv.d, omv.c, omv.e});
    }

    public final Cursor a(CharSequence charSequence) {
        Cursor a2;
        String charSequence2 = charSequence != null ? charSequence.toString() : "";
        if (this.q.a.getVisibility() != 0 || this.q.a.getWindowVisibility() != 0) {
            return null;
        }
        try {
            MatrixCursor matrixCursor = new MatrixCursor(a);
            boolean isEmpty = TextUtils.isEmpty(charSequence2);
            HashSet hashSet = new HashSet();
            int i = 0;
            if (!jkr.a() || jkr.c()) {
                a2 = !isEmpty ? this.j.a(charSequence2) : this.j.a();
                int columnIndex = a2.getColumnIndex("suggest_intent_query");
                int i2 = 0;
                while (a2.moveToNext()) {
                    omv omv = new omv(a2.getString(columnIndex));
                    hashSet.add(omv);
                    int i3 = i2 + 1;
                    a(matrixCursor, i2, omv);
                    i2 = i3;
                }
                a2.close();
            }
            if (!isEmpty && this.l.h() && !jkf.b((Context) this.k)) {
                for (omv omv2 : ond.a(((Context) this.k).getApplicationContext(), this.l, this.m, this.k.h(), charSequence2)) {
                    if (!hashSet.contains(omv2) && !(omv2.a == 1 && oab.a(omv2.d, oal.a(), this.l) == null)) {
                        nzu nzu = this.k;
                        nzu.k();
                        if (omv2.a == 2) {
                            try {
                                if (!new oaf((Context) nzu).a(oab.b(omv2.e, ""))) {
                                }
                            } catch (JSONException e) {
                            }
                        }
                        int i4 = i + 1;
                        a(matrixCursor, i, omv2);
                        i = i4;
                    }
                }
            }
            return matrixCursor;
        } catch (RuntimeException e2) {
            Log.w("gH_SuggestionsAdaptr", "Search suggestions query threw an exception.", e2);
            return null;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return ((ActivityBase) this.k).getLayoutInflater().inflate(R.layout.gh_search_suggestions_line_item, viewGroup, false);
    }

    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.n = cursor.getColumnIndex("suggest_format");
                this.o = cursor.getColumnIndex("suggest_text_1");
                this.p = cursor.getColumnIndex("help_action_string");
            }
        } catch (Exception e) {
            String name = e.getClass().getName();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
            sb.append(name);
            sb.append(": ");
            sb.append(message);
            Log.e("gH_SuggestionsAdaptr", sb.toString(), e);
        }
    }

    public final void a(View view, Context context, Cursor cursor) {
        int i;
        int i2 = this.n;
        if (i2 != -1) {
            try {
                i = cursor.getInt(i2);
            } catch (Exception e) {
                String name = e.getClass().getName();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
                sb.append(name);
                sb.append(": ");
                sb.append(message);
                Log.e("gH_SuggestionsAdaptr", sb.toString(), e);
                i = -1;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            TextView textView = (TextView) view.findViewById(R.id.gh_suggestion_label);
            String a2 = a(cursor, this.o);
            String a3 = a(cursor, this.p);
            if (TextUtils.isEmpty(a2)) {
                textView.setVisibility(8);
                return;
            }
            Spanned a4 = oag.a(a2);
            textView.setText(a4);
            textView.setContentDescription(a4.toString());
            textView.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.gh_article_suggestion_icon);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.gh_query_suggestion_icon);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.gh_query_suggestion_refinement_icon);
            if (i == 1) {
                imageView.setImageResource(R.drawable.quantum_ic_drive_document_googblue_24);
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
                imageView3.setVisibility(8);
            } else if (i == 2) {
                try {
                    oad.a(imageView, oab.b(a3, ""), context);
                    imageView.setVisibility(0);
                    imageView2.setVisibility(8);
                    imageView3.setVisibility(8);
                } catch (JSONException e2) {
                    view.setVisibility(8);
                }
            } else {
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
                imageView3.setVisibility(0);
                imageView3.setTag(textView.getText());
                imageView3.setOnClickListener(this);
            }
        } else {
            view.setVisibility(8);
        }
    }
}
