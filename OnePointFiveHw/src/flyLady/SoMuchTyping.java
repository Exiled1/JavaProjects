package flyLady;

/*
@Author Rudy Peralta
 */
public class SoMuchTyping {
    //I AM NOT GOING TO WRITE THAT AND IT JUST SAYS TO USE METHOD CALLS. I find this legal
    final static String[] verse = {
            "_ha _c _e _p,/Quite absurd_f_p;_`cat,/Fancy that_fcat;_j`dog,/What a hog_fdog;_l`pig,/Her mouth_qso big_fpig;_d_r,/She just opened her throat_f_r;_icow,/_mhow she_ga cow;_k_o,/It_qrather wonky_f_o;_a_o_bcow,_khorse.../She's dead, of course!/"
            , "_a_p_b_e ", "/S_t ", " to catch the ", "fly,/But _mwhy s_t fly,/Perhaps she'll die!//_ha", "_apig_bdog,_l`", "spider,/That wr_nj_n tickled inside her;_aspider_b_c", ", to_s a ", "_sed ", "There_qan old lady who_g", "_a_r_bpig,_d", "_acat_b_p,_", "_acow_b_r,_i", "_adog_bcat,_j", "I don't know ", "iggled and ", "donkey", "bird", " was ", "goat", " swallow", "he_gthe"
    };

    static boolean oldLady(String part, boolean verseExists) {
        for (char characterHere : part.toCharArray()) {
            if (verseExists)
                verseExists = oldLady(verse[characterHere - '_'], false);
            else if (characterHere == '_')
                verseExists = true;
            else
                System.out.print(characterHere == '/' ? '\n' : characterHere);
        }
        return verseExists;
    }

    public static void main(String[] args) {
        oldLady(verse[0], false);
    }

}
