public static boolean checkPassword()
{
    System.out.print("Enter password: ");
    String password = in.nextLine();

    if (password.equalsIgnoreCase("eduardo"))
    {
        return true;
    }

    System.out.println("Incorrect password.");
    return false;
}

case 1:
    if (checkPassword())
    {
        addPassenger();
    }
    break;
