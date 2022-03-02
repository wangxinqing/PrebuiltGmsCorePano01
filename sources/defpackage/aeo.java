package defpackage;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: aeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeo extends ahx implements View.OnClickListener {
    public int a = 1;
    private final SearchView j;
    private final SearchableInfo k;
    private final Context l;
    private final WeakHashMap m;
    private final int n;
    private ColorStateList o;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private int t = -1;
    private int u = -1;

    public aeo(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.k);
        this.j = searchView;
        this.k = searchableInfo;
        this.n = searchView.l;
        this.l = context;
        this.m = weakHashMap;
    }

    private final Drawable a(Uri uri) {
        InputStream openInputStream;
        int i;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    String authority = uri.getAuthority();
                    if (!TextUtils.isEmpty(authority)) {
                        Resources resourcesForApplication = this.e.getPackageManager().getResourcesForApplication(authority);
                        List<String> pathSegments = uri.getPathSegments();
                        if (pathSegments != null) {
                            int size = pathSegments.size();
                            if (size == 1) {
                                i = Integer.parseInt(pathSegments.get(0));
                            } else if (size == 2) {
                                i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                            } else {
                                throw new FileNotFoundException("More than two path segments: " + uri);
                            }
                            if (i != 0) {
                                return resourcesForApplication.getDrawable(i);
                            }
                            throw new FileNotFoundException("No resource found for: " + uri);
                        }
                        throw new FileNotFoundException("No path: " + uri);
                    }
                    throw new FileNotFoundException("No authority: " + uri);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new FileNotFoundException("No package found for authority: " + uri);
                } catch (NumberFormatException e2) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                } catch (Resources.NotFoundException e3) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                openInputStream = this.l.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    Drawable createFromStream = Drawable.createFromStream(openInputStream, (String) null);
                    try {
                        openInputStream.close();
                    } catch (IOException e4) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
                    }
                    return createFromStream;
                }
                throw new FileNotFoundException("Failed to open " + uri);
            }
        } catch (FileNotFoundException e5) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (IOException e6) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e6);
            }
            throw th;
        }
    }

    private final Drawable b(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.m.get(str);
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return null;
    }

    private static final void d(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle == null || bundle.getBoolean("in_progress")) {
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = b(this.e, this.d, viewGroup);
            if (b != null) {
                ((aen) b.getTag()).a.setText(e.toString());
            }
            return b;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a2 = a(this.e, this.d, viewGroup);
            if (a2 != null) {
                ((aen) a2.getTag()).a.setText(e.toString());
            }
            return a2;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        d(this.d);
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        d(this.d);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.j.b((CharSequence) tag);
        }
    }

    public final CharSequence b(Cursor cursor) {
        String a2;
        String a3;
        if (cursor == null) {
            return null;
        }
        String a4 = a(cursor, "suggest_intent_query");
        if (a4 != null) {
            return a4;
        }
        if (this.k.shouldRewriteQueryFromData() && (a3 = a(cursor, "suggest_intent_data")) != null) {
            return a3;
        }
        if (!this.k.shouldRewriteQueryFromText() || (a2 = a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a2;
    }

    private final Drawable a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.l.getPackageName() + "/" + parseInt;
            Drawable b = b(str2);
            if (b != null) {
                return b;
            }
            Drawable a2 = kf.a(this.l, parseInt);
            a(str2, a2);
            return a2;
        } catch (NumberFormatException e) {
            Drawable b2 = b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable a3 = a(Uri.parse(str));
            a(str, a3);
            return a3;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    private static String a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    private static final void a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private static final void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private final void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.m.put(str, drawable.getConstantState());
        }
    }

    public final Cursor a(CharSequence charSequence) {
        Cursor cursor;
        String suggestAuthority;
        String[] strArr;
        String charSequence2 = charSequence != null ? charSequence.toString() : "";
        if (this.j.getVisibility() != 0 || this.j.getWindowVisibility() != 0) {
            return null;
        }
        try {
            SearchableInfo searchableInfo = this.k;
            if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                cursor = null;
            } else {
                Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                String suggestPath = searchableInfo.getSuggestPath();
                if (suggestPath != null) {
                    fragment.appendEncodedPath(suggestPath);
                }
                fragment.appendPath("search_suggest_query");
                String suggestSelection = searchableInfo.getSuggestSelection();
                if (suggestSelection != null) {
                    strArr = new String[]{charSequence2};
                } else {
                    fragment.appendPath(charSequence2);
                    strArr = null;
                }
                fragment.appendQueryParameter("limit", "50");
                cursor = this.e.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
            }
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a2 = super.a(context, cursor, viewGroup);
        a2.setTag(new aen(a2));
        ((ImageView) a2.findViewById(R.id.edit_query)).setImageResource(this.n);
        return a2;
    }

    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.p = cursor.getColumnIndex("suggest_text_1");
                this.q = cursor.getColumnIndex("suggest_text_2");
                this.r = cursor.getColumnIndex("suggest_text_2_url");
                this.s = cursor.getColumnIndex("suggest_icon_1");
                this.t = cursor.getColumnIndex("suggest_icon_2");
                this.u = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final void a(View view, Context context, Cursor cursor) {
        int i;
        Drawable drawable;
        Drawable drawable2;
        Drawable.ConstantState constantState;
        CharSequence charSequence;
        Cursor cursor2 = cursor;
        aen aen = (aen) view.getTag();
        int i2 = this.u;
        if (i2 != -1) {
            i = cursor2.getInt(i2);
        } else {
            i = 0;
        }
        if (aen.a != null) {
            a(aen.a, (CharSequence) a(cursor2, this.p));
        }
        if (aen.b != null) {
            String a2 = a(cursor2, this.r);
            if (a2 == null) {
                charSequence = a(cursor2, this.q);
            } else {
                if (this.o == null) {
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.o = this.e.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(a2);
                TextAppearanceSpan textAppearanceSpan = r10;
                TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan((String) null, 0, 0, this.o, (ColorStateList) null);
                spannableString.setSpan(textAppearanceSpan, 0, a2.length(), 33);
                charSequence = spannableString;
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aen.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aen.a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aen.a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aen.a.setMaxLines(1);
                }
            }
            a(aen.b, charSequence);
        }
        ImageView imageView = aen.c;
        Drawable drawable3 = null;
        if (imageView != null) {
            int i3 = this.s;
            if (i3 != -1) {
                drawable = a(cursor2.getString(i3));
                if (drawable == null) {
                    ComponentName searchActivity = this.k.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.m.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.m.get(flattenToShortString);
                        drawable = constantState2 != null ? constantState2.newDrawable(this.l.getResources()) : null;
                    } else {
                        PackageManager packageManager = this.e.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable2 = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable2 == null) {
                                    Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                                    drawable2 = null;
                                }
                            } else {
                                drawable2 = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                            drawable2 = null;
                        }
                        if (drawable2 != null) {
                            constantState = drawable2.getConstantState();
                        } else {
                            constantState = null;
                        }
                        this.m.put(flattenToShortString, constantState);
                        drawable = drawable2;
                    }
                    if (drawable == null) {
                        drawable = this.e.getPackageManager().getDefaultActivityIcon();
                    }
                }
            } else {
                drawable = null;
            }
            a(imageView, drawable, 4);
        }
        ImageView imageView2 = aen.d;
        if (imageView2 != null) {
            int i4 = this.t;
            if (i4 != -1) {
                drawable3 = a(cursor2.getString(i4));
            }
            a(imageView2, drawable3, 8);
        }
        if (this.a == 1 && (i & 1) != 0) {
            aen.e.setVisibility(0);
            aen.e.setTag(aen.a.getText());
            aen.e.setOnClickListener(this);
            return;
        }
        aen.e.setVisibility(8);
    }
}
