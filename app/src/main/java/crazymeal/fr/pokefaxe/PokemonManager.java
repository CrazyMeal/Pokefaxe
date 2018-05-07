package crazymeal.fr.pokefaxe;

import java.util.ArrayList;

import crazymeal.fr.pokefaxe.model.Pokemon;
import lombok.Data;

@Data
public final class PokemonManager {

    private static PokemonManager INSTANCE;

    private ArrayList<Pokemon> pokemonList;

    public static PokemonManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PokemonManager();
        }
        return INSTANCE;
    }

    private PokemonManager() {
        this.pokemonList = this.initPokemonList();
    }

    private ArrayList<Pokemon> initPokemonList() {
        ArrayList<Pokemon> initList = new ArrayList<>();
        initList.add(new Pokemon(1, "Floraffe"));
        initList.add(new Pokemon(2, "Girbloom"));
        initList.add(new Pokemon(3, "Lumbraffe"));
        initList.add(new Pokemon(4, "Turtorrid"));
        initList.add(new Pokemon(5, "Turtorch"));
        initList.add(new Pokemon(6, "Briortoise"));
        initList.add(new Pokemon(7, "Drippo"));
        initList.add(new Pokemon(8, "Muppo"));
        initList.add(new Pokemon(9, "Mupporain"));
        initList.add(new Pokemon(10, "Checkip"));
        initList.add(new Pokemon(11, "Chichep"));
        initList.add(new Pokemon(12, "Betle"));
        initList.add(new Pokemon(13, "Watpod"));
        initList.add(new Pokemon(14, "Aechtuoth"));
        initList.add(new Pokemon(15, "Nurrywot"));
        initList.add(new Pokemon(16, "Robustile"));
        initList.add(new Pokemon(17, "Vigorewt"));
        initList.add(new Pokemon(18, "Ospry"));
        initList.add(new Pokemon(19, "Nimbird"));
        initList.add(new Pokemon(20, "Brisprey"));

        initList.add(new Pokemon(21, "Droopup"));
        initList.add(new Pokemon(22, "Droodle"));
        initList.add(new Pokemon(23, "Snuboodle"));
        initList.add(new Pokemon(24, "Glidish"));
        initList.add(new Pokemon(25, "Parrogill"));
        initList.add(new Pokemon(26, "Fennup"));
        initList.add(new Pokemon(27, "Furfox"));
        initList.add(new Pokemon(28, "Fennihound"));
        initList.add(new Pokemon(29, "Eleasel"));
        initList.add(new Pokemon(30, "Crawlagmyte"));
        initList.add(new Pokemon(31, "Crawlactyte"));
        initList.add(new Pokemon(32, "Gropulse"));
        initList.add(new Pokemon(33, "Grosgust"));
        initList.add(new Pokemon(34, "Nausty"));
        initList.add(new Pokemon(35, "Awshroom"));
        initList.add(new Pokemon(36, "Awfungus"));
        initList.add(new Pokemon(37, "Waflame"));
        initList.add(new Pokemon(38, "Flammoth"));
        initList.add(new Pokemon(39, "Cornal"));
        initList.add(new Pokemon(40, "Huskune"));

        initList.add(new Pokemon(41, "Locusk"));
        initList.add(new Pokemon(42, "Biltune"));
        initList.add(new Pokemon(43, "Trumbil"));
        initList.add(new Pokemon(44, "Raveral"));
        initList.add(new Pokemon(45, "Savicious"));
        initList.add(new Pokemon(46, "Aligila"));
        initList.add(new Pokemon(47, "Gilabre"));
        initList.add(new Pokemon(48, "Serpid"));
        initList.add(new Pokemon(49, "Serpyrant"));
        initList.add(new Pokemon(50, "Moniterra"));
        initList.add(new Pokemon(51, "Donkish"));
        initList.add(new Pokemon(52, "Doggedack"));
        initList.add(new Pokemon(53, "Maglett"));
        initList.add(new Pokemon(54, "Blye"));
        initList.add(new Pokemon(55, "Demoblye"));
        initList.add(new Pokemon(56, "Cilera"));
        initList.add(new Pokemon(57, "Cileri"));
        initList.add(new Pokemon(58, "Cilerulic"));
        initList.add(new Pokemon(59, "Captivine"));
        initList.add(new Pokemon(60, "Quadrivine"));

        initList.add(new Pokemon(61, "Quadrivour"));
        initList.add(new Pokemon(62, "Geolite"));
        initList.add(new Pokemon(63, "Dynamine"));
        initList.add(new Pokemon(64, "Brawllop"));
        initList.add(new Pokemon(65, "Bruthud"));
        initList.add(new Pokemon(66, "Clobbrute"));
        initList.add(new Pokemon(67, "Lushoot"));
        initList.add(new Pokemon(68, "Luxuridos"));
        initList.add(new Pokemon(69, "Laffon"));
        initList.add(new Pokemon(70, "Leagon"));
        initList.add(new Pokemon(71, "Seadrigone"));
        initList.add(new Pokemon(72, "Parashok"));
        initList.add(new Pokemon(73, "Parakute"));
        initList.add(new Pokemon(74, "Herbisaur"));
        initList.add(new Pokemon(75, "Clorisaur"));
        initList.add(new Pokemon(76, "Prifish"));
        initList.add(new Pokemon(77, "Clowala"));
        initList.add(new Pokemon(78, "Jugwala"));
        initList.add(new Pokemon(79, "Trapala"));
        initList.add(new Pokemon(80, "Sealin"));

        initList.add(new Pokemon(81, "Sealrus"));
        initList.add(new Pokemon(82, "Fossear"));
        initList.add(new Pokemon(83, "Zemur"));
        initList.add(new Pokemon(84, "Dracies"));
        initList.add(new Pokemon(85, "Aguagon"));
        initList.add(new Pokemon(86, "Nautalisk"));
        initList.add(new Pokemon(87, "Phantot"));
        initList.add(new Pokemon(88, "Phantisma"));
        initList.add(new Pokemon(89, "Wriasma"));
        initList.add(new Pokemon(90, "Scrab"));
        initList.add(new Pokemon(91, "Scrobster"));
        initList.add(new Pokemon(92, "Slobster"));
        initList.add(new Pokemon(93, "Froscat"));
        initList.add(new Pokemon(94, "Arcatic"));
        initList.add(new Pokemon(95, "Crestilian"));
        initList.add(new Pokemon(96, "Crestavian"));
        initList.add(new Pokemon(97, "Crestadon"));
        initList.add(new Pokemon(98, "Trophue"));
        initList.add(new Pokemon(99, "Chalicast"));
        initList.add(new Pokemon(100, "Shuzal"));

        initList.add(new Pokemon(101, "Burzal"));
        initList.add(new Pokemon(102, "Werezal"));
        initList.add(new Pokemon(103, "Grawsora"));
        initList.add(new Pokemon(104, "Nrakros"));
        initList.add(new Pokemon(105, "Arizox"));
        initList.add(new Pokemon(106, "Namagon"));
        initList.add(new Pokemon(107, "Arxon"));
        initList.add(new Pokemon(108, "Ookichai"));
        initList.add(new Pokemon(109, "Liahyet"));
        return  initList;
    }
}
