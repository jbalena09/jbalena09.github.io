package test;


import item.Dice;
import character.Knight;
import character.Thief;
import character.Mage;
import item.Summon;
import java.util.Random;


public class Battle {

    static Random rd = new Random();

    public static void main(String[] args) {
        //first battle!
        Mage m = new Mage("Mage", 20, 15);
        Thief t = new Thief("Thief", 15, 5);

        int thiefScore = 0, mageScore = 0, knightScore = 0;
        System.out.println("---------------------------");
        if (battle1(m, t).equals("Thief")) {
            thiefScore += 1;
            System.out.println("Thief Wins");
            System.out.println("Thief Score: " + thiefScore);
        } else {
            mageScore += 1;
            System.out.println("Mage Wins");
            System.out.println("Mage Score: " + mageScore);
        }
        System.out.println("---------------------------");
        System.out.println("");
//        second battle!

        Knight k = new Knight("Knight", 25, 5);
        Thief t2 = new Thief("Thief", 20, 5);

        if (battle2(t2, k).equals("Thief")) {
            thiefScore += 1;
            System.out.println("Thief Wins");
            System.out.println("Thief Score: " + thiefScore);
        } else {
            knightScore += 1;
            System.out.println("Knight Wins");
            System.out.println("Knight Score: " + knightScore);
        }
        System.out.println("---------------------------");
        System.out.println("");
        //third battle!

        Knight k2 = new Knight("Knight", 13, 5);
        Mage m2 = new Mage("Mage", 15, 15);

        if (battle3(k2, m2).equals("Knight")) {
            knightScore += 1;
            System.out.println("Knight Wins");
            System.out.println("Knight Score: " + knightScore);
        } else {
            mageScore += 1;
            System.out.println("Mage Wins");
            System.out.println("Mage Score: " + mageScore);
        }
        System.out.println("---------------------------");
        System.out.println("");

        //Final Score
        if (thiefScore > mageScore && thiefScore > knightScore) {
            System.out.println("Thief wins the battle!");
            System.out.println("Thief: " + thiefScore);
            System.out.println("Mage: " + mageScore);
            System.out.println("Knight: " + knightScore);
        } else if (mageScore > thiefScore && mageScore > knightScore) {
            System.out.println("Mage wins the battle!");
            System.out.println("Mage: " + mageScore);
            System.out.println("Thief: " + thiefScore);
            System.out.println("Knight: " + knightScore);
        } else if (knightScore > mageScore && knightScore > thiefScore) {
            System.out.println("Knight wins the battle!");
            System.out.println("Knight: " + knightScore);
            System.out.println("Thief: " + thiefScore);
            System.out.println("Mage: " + mageScore);
        } else {
            System.out.println("Draw!");
            System.out.println("Knight: " + knightScore);
            System.out.println("Thief: " + thiefScore);
            System.out.println("Mage: " + mageScore);
        }

    }

    //Mage vs Thief
    public static String battle1(Mage mage, Thief thief) {
        int mageChoice = 0, mageChance, mageDamage = 0, mageFireball = 0;
        //chance = dice thiefChance
        Dice dice = new Dice();
        int thiefChoice, thiefChance, thiefDamage;
        int counter = 1;
        String winner = "";
        System.out.println("Mage vs Thief");
        System.out.println(mage.getName() + ": " + mage.getCurrentLife());
        System.out.println(thief.getName() + ": " + thief.getCurrentLife());
        System.out.println("");
        while (true) {
            if (counter == 1) {
                System.out.println("Round " + counter);
                if (counter % 2 == 0) {
                    mage.petability();
                } else {
                    thief.petability();
                }
                int x = mage.attack();
                int y = thief.attack();
                mage.wound(y);
                thief.wound(x);
                System.out.println(mage.getName() + " attacks " + thief.getName() + " for " + (x - thief.armor) + " dmg");
                System.out.println(thief.getName() + " attacks " + mage.getName() + " for " + (y - mage.armor) + " dmg");
            } else {
                System.out.println("Round " + counter);
                if (counter % 2 == 0) {
                    mage.petability();
                } else {
                    thief.petability();
                }
                mageChance = rd.nextInt(2) + 1;
                mageDamage = mage.attack();
                //mage with no skill
                if (mageChance == 1) {
                    System.out.println("Mage attacks thief for " + (mageDamage - thief.armor) + " dmg");
                    //mage with skill
                } else if (mageChance == 2) {
                    mageChoice = rd.nextInt(2) + 1;
                    //fireBall
                    if (mageChoice == 1) {
                        mageFireball = mage.fireball();
                        if (mageFireball != 0) {
                            System.out.println("Mage attacks thief for " + (mageDamage - thief.armor) + " dmg and at the same time uses fireball for " + (mageFireball - thief.armor) + " dmg");
                        } else {
                            System.out.println("Mage attacks thief for " + (mageDamage - thief.armor) + " dmg and at the same time uses fireball but was not successful out of mana!");
                        }
                        //heal
                    } else if (mageChoice == 2) {
                        System.out.println("Mage attacks thief for " + (mageDamage - thief.armor) + " dmg and uses heal " + mage.heal(rd.nextInt(2) + 1));
                    }
                }

                thiefChance = dice.roll();
                thiefDamage = thief.attack();
                //thief with no skills
                if ((thiefChance % 2) == 0) {
                    //mage uses fireball here
                    if (mageChoice == 1) {
                        thief.wound(mageDamage);
                        if (mageFireball != 0) {
                            thief.wound(mageFireball);
                        }
                        if (thief.getCurrentLife() > 0) {
                            System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " dmg");
                        }
                        mage.wound(thiefDamage);
                    } else {
                        thief.wound(mageDamage);
                        if (thief.getCurrentLife() > 0) {
                            System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " dmg");
                        }
                        mage.wound(thiefDamage);
                    }
                    //thief with skill
                } else if ((thiefChance % 2) != 0) {
                    thiefChoice = rd.nextInt(2) + 1;
                    //evade
                    if (thiefChoice == 1) {
                        if (mageChoice == 1) {
                            int thiefEvade = thief.evade();
                            if (mageFireball != 0) {
                                thief.wound(mageFireball);
                            }
                            if (thiefEvade > 0) {
                                thief.wound(mageDamage - thiefEvade);
                                if (thief.getCurrentLife() > 0) {
                                    System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " and uses evade ");
                                }
                            } else {
                                thief.wound(mageDamage);
                                if (thief.getCurrentLife() > 0) {
                                    System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " and tried to use evade but was not successfull (no stamina) ");
                                }
                            }
                            mage.wound(thiefDamage);
                        } else {
                            int thiefEvade = thief.evade();
                            thief.wound(mageDamage);
                            if (thiefEvade > 0) {
                                thief.wound(mageDamage - thiefEvade);
                                if (thief.getCurrentLife() > 0) {
                                    System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " and uses evade ");
                                }
                            } else {
                                thief.wound(mageDamage);
                                if (thief.getCurrentLife() > 0) {
                                    System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " and tried to use evade but was not successfull (no stamina) ");
                                }
                            }
                            mage.wound(thiefDamage);
                        }

                        //heal
                    } else if (thiefChoice == 2) {
                        if (mageChoice == 1) {
                            thief.wound(mageDamage);
                            if (mageFireball != 0) {
                                thief.wound(mageFireball);
                            }
                            if (thief.getCurrentLife() > 0) {
                                System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " dmg and uses heal " + thief.heal(rd.nextInt(2) + 1));
                            }
                            mage.wound(thiefDamage);
                        } else {
                            thief.wound(mageDamage);
                            if (thief.getCurrentLife() > 0) {
                                System.out.println("Thief attacks mage for " + (thiefDamage - mage.armor) + " dmg and uses heal " + thief.heal(rd.nextInt(2) + 1));
                            }
                            mage.wound(thiefDamage);
                        }
                    }
                }
            }

            System.out.println(mage.getName() + ": " + mage.getCurrentLife());
            System.out.println(thief.getName() + ": " + thief.getCurrentLife());
            System.out.println("");
            if (mage.getCurrentLife() <= 0) {
                winner = "Thief";
                break;

            } else if (thief.getCurrentLife() <= 0) {
                winner = "Mage";
                break;

            }

            counter++;
        }
        return winner;
    }

    //Thief vs Knight
    public static String battle2(Thief thief, Knight knight) {
        int thiefChoice = 0, thiefChance, thiefDamage = 0, thiefEvade = 0;
        //chance = dice knightChance
        Dice dice = new Dice();
        int knightChoice, knightChance, knightDamage;
        int counter = 1;
        String winner = "";

        System.out.println("Thief vs Knight");
        System.out.println(thief.getName() + ": " + thief.getCurrentLife());
        System.out.println(knight.getName() + ": " + knight.getCurrentLife());
        System.out.println("");
        while (true) {
            if (counter == 1) {
                System.out.println("Round " + counter);
                if (counter % 6 == 0) {
                    knight.petability();
                    if (knight.petSkill == 1) {
                        winner = "Knight";
                        break;
                    }
                } else if (counter % 2 != 0) {
                    thief.petability();
                }
                int x = thief.attack();
                int y = knight.attack();
                knight.wound(x);
                thief.wound(y);
                System.out.println(thief.getName() + " attacks " + knight.getName() + " for " + (x - knight.armor) + " dmg");
                System.out.println(knight.getName() + " attacks " + thief.getName() + " for " + (y - thief.armor) + " dmg");
            } else {
                System.out.println("Round " + counter);
                if (counter % 6 == 0) {
                    knight.petability();
                    if (knight.petSkill == 1) {
                        winner = "Knight";
                        break;
                    }
                } else if (counter % 2 != 0) {
                    thief.petability();
                }
                thiefChance = rd.nextInt(2) + 1;
                thiefDamage = thief.attack();
                //thief no skill
                if (thiefChance == 1) {
                    System.out.println("Thief attacks knight for " + (thiefDamage - knight.armor) + " dmg");
                    //thief with skill
                } else if (thiefChance == 2) {
                    thiefChoice = rd.nextInt(2) + 1;
                    //thief uses evade
                    if (thiefChoice == 1) {
                        thiefEvade = thief.evade();
                        if (thiefEvade != 0) {
                            System.out.println("Thief attacks knight for " + (thiefDamage - knight.armor) + " and uses evade ");
                        } else {
                            System.out.println("Thief attacks knight for " + (thiefDamage - knight.armor) + " and tried to use evade but was not successfull (no stamina) ");
                        }
                        //thief heals
                    } else if (thiefChoice == 2) {
                        System.out.println("Thief attacks knight for " + (thiefDamage - knight.armor) + " dmg and uses heal " + thief.heal(rd.nextInt(2) + 1));
                    }
                }
                knightChance = dice.roll();
                knightDamage = knight.attack();
                if ((thiefChance % 2) == 0) {
                    //thief uses evade
                    if (thiefChoice == 1) {
                        if (thiefEvade != 0) {
                            int woundHigher = knightDamage - (thiefEvade);
                            if (woundHigher > 0) {
                                thief.wound(knightDamage - thiefEvade);
                            }
                        }
                        knight.wound(thiefDamage);
                        if (knight.getCurrentLife() > 0) {
                            System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " dmg");
                        }
                    } else {
                        thief.wound(knightDamage);
                        knight.wound(thiefDamage);
                        if (knight.getCurrentLife() > 0) {
                            System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " dmg");
                        }
                    }
                    //knight with skill
                } else if ((thiefChance % 2) != 0) {
                    knightChoice = rd.nextInt(2) + 1;
                    //knight block
                    if (knightChoice == 1) {
                        if (thiefChoice == 1) {
                            if (thiefEvade != 0) {
                                int woundHigher = knightDamage - (thiefEvade);
                                if (woundHigher > 0) {
                                    thief.wound(knightDamage - thiefEvade);
                                }
                            }
                            if (knight.block() != 0) {
                                if (knight.getCurrentLife() > 0) {
                                    System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " dmg and uses block!");
                                }
                            } else {
                                knight.wound(thiefDamage);
                                if (knight.getCurrentLife() > 0) {
                                    System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " and tried to use block but durability is not enought");
                                }
                            }
                        } else {
                            thief.wound(knightDamage);
                            if (knight.block() != 0) {
                                if (knight.getCurrentLife() > 0) {
                                    System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " dmg and uses block!");
                                }
                            } else {
                                knight.wound(thiefDamage);
                                if (knight.getCurrentLife() > 0) {
                                    System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " and tried to use block but durability is not enought");
                                }
                            }
                        }
                        //heals
                    } else if (knightChoice == 2) {
                        if (thiefChoice == 1) {
                            if (thiefEvade != 0) {
                                int woundHigher = knightDamage - (thiefEvade);
                                if (woundHigher > 0) {
                                    thief.wound(knightDamage - thiefEvade);
                                }
                            }
                            knight.wound(thiefDamage);
                            if (knight.getCurrentLife() > 0) {
                                System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " dmg and uses heal " + knight.heal(rd.nextInt(2) + 1));
                            }
                        } else {
                            thief.wound(knightDamage);
                            knight.wound(thiefDamage);
                            if (knight.getCurrentLife() > 0) {
                                System.out.println("Knight attacks thief for " + (knightDamage - thief.armor) + " dmg and uses heal " + knight.heal(rd.nextInt(2) + 1));
                            }
                        }
                    }
                }
            }

            System.out.println(thief.getName() + ": " + thief.getCurrentLife());
            System.out.println(knight.getName() + ": " + knight.getCurrentLife());
            System.out.println("");
            if (knight.getCurrentLife() <= 0) {
                winner = "Thief";
                break;
            } else if (thief.getCurrentLife() <= 0) {
                winner = "Knight";
                break;
            }

            counter++;
        }
        return winner;
    }

    //Knight vs Mage
    public static String battle3(Knight knight, Mage mage) {
        int mageChoice = 0, mageChance, mageDamage = 0, mageFireball = 0;
        //chance = dice mageChance
        Dice dice = new Dice();
        int knightChoice = 0, knightChance, knightDamage, knightBlock = 0;
        int counter = 1;
        String winner = "";

        System.out.println("Knight vs Mage");
        System.out.println(knight.getName() + ": " + knight.getCurrentLife());
        System.out.println(mage.getName() + ": " + mage.getCurrentLife());
        System.out.println("");
        while (true) {
            if (counter == 1) {
                System.out.println("Round " + counter);
                if (counter % 6 == 0) {
                    knight.petability();
                    if (knight.petSkill == 1) {
                        winner = "Knight";
                        break;
                    }
                }
                if (counter % 2 == 0) {
                    mage.petability();
                }
                int x = knight.attack();
                int y = mage.attack();
                knight.wound(y);
                mage.wound(x);
                System.out.println(knight.getName() + " attacks " + mage.getName() + " for " + (x - mage.armor) + " dmg");
                System.out.println(mage.getName() + " attacks " + knight.getName() + " for " + (y - knight.armor) + " dmg");
            } else {
                System.out.println("Round " + counter);
                if (counter % 6 == 0) {
                    knight.petability();
                    if (knight.petSkill == 1) {
                        winner = "Knight";
                        break;
                    }
                }
                if (counter % 2 == 0) {
                    mage.petability();
                }
                knightChance = rd.nextInt(2) + 1;
                knightDamage = knight.attack();

                //knight no skills
                if (knightChance == 1) {
                    System.out.println("Knight attacks mage for " + (knightDamage - mage.armor) + " dmg");
                    //knight with skills
                } else if (knightChance == 2) {
                    knightChoice = rd.nextInt(2) + 1;
                    //block
                    if (knightChoice == 1) {
                        knightBlock = knight.block();
                        if (knightBlock != 0) {
                            System.out.println("Knight attacks mage for " + (knightDamage - mage.armor) + " dmg and uses block!");
                        } else {
                            System.out.println("Knight attacks mage for " + (knightDamage - mage.armor) + " and tried to use block but durability is not enough");
                        }
                    } else if (knightChoice == 2) {
                        System.out.println("Knight attacks mage for " + (knightDamage - mage.armor) + " dmg and uses heal " + knight.heal(rd.nextInt(2) + 1));
                    }
                }

                mageChance = dice.roll();
                mageDamage = mage.attack();
                //mage with no skills
                if ((mageChance % 2) == 0) {
                    //knight uses block
                    if (knightChoice == 1) {
                        if (knightBlock != 0) {
                            mage.wound(knightDamage);
                            if (mage.getCurrentLife() > 0) {
                                System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg");
                            }
                        }
                    } else {
                        mage.wound(knightDamage);
                        knight.wound(mageDamage);
                        if (mage.getCurrentLife() > 0) {
                            System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg");
                        }
                    }
                } else if ((mageChance % 2) != 0) {
                    mageChoice = rd.nextInt(2) + 1;
                    //fireball
                    if (mageChoice == 1) {
                        mageFireball = mage.fireball();
                        //knight uses block
                        if (knightChoice == 1) {
                            if (knightBlock != 0) {
                                mage.wound(knightDamage);
                                if (mage.getCurrentLife() > 0) {
                                    if (mageFireball != 0) {
                                        System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg and at the same time uses fireball for " + (mageFireball - knight.armor) + " dmg");
                                    } else {
                                        System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg and at the same time uses fireball but was not successful out of mana!");
                                    }
                                }
                            }
                        } else {
                            mage.wound(knightDamage);
                            knight.wound(mageDamage);
                            knight.wound(mageFireball);
                            if (mage.getCurrentLife() > 0) {
                                if (mageFireball != 0) {
                                    System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg and at the same time uses fireball for " + (mageFireball - knight.armor) + " dmg");
                                } else {
                                    System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg and at the same time uses fireball but was not successful out of mana!");
                                }
                            }
                        }
                        //heal
                    } else if (mageChoice == 2) {
                        if (knightChoice == 1) {
                            if (knightBlock != 0) {
                                mage.wound(knightDamage);
                                if (mage.getCurrentLife() > 0) {
                                    System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg and uses heal " + mage.heal(rd.nextInt(2) + 1));
                                }
                            }
                        } else {
                            mage.wound(knightDamage);
                            knight.wound(mageDamage);
                            if (mage.getCurrentLife() > 0) {
                                System.out.println("Mage attacks knight for " + (mageDamage - knight.armor) + " dmg and uses heal " + mage.heal(rd.nextInt(2) + 1));
                            }
                        }
                    }
                }
            }
            System.out.println(knight.getName() + ": " + knight.getCurrentLife());
            System.out.println(mage.getName() + ": " + mage.getCurrentLife());
            System.out.println("");

            if (knight.getCurrentLife() <= 0) {
                winner = "Mage";
                break;

            } else if (mage.getCurrentLife() <= 0) {
                winner = "Knight";
                break;

            }

            knightChoice = 0;
            counter++;
        }
        return winner;
    }
}
